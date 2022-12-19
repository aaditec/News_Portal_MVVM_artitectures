package com.nitv.newsapp.ui.main

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.view.Menu
import androidx.activity.viewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.bumptech.glide.Glide
import com.nitv.newsapp.MyApplication
import com.nitv.newsapp.R
import com.nitv.newsapp.base.BaseActivity
import com.nitv.newsapp.data.model.MenuItem
import com.nitv.newsapp.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class MainActivity : BaseActivity<ActivityMainBinding>() {
    val viewModel: MainViewModel by viewModels()

    lateinit var context: Context
    private val subscriptions = CompositeDisposable()
    private val menuItems = listOf(
        MenuItem(
            label = "Feed",
            image = R.drawable.explore,
            destinationId = R.id.feedFragment
        ),
        MenuItem(
            label = "Favorite",
            image = R.drawable.favorite,
            destinationId = R.id.favoriteFragment
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as MyApplication).getAppComponent().inject(this)
     }
    override fun onViewReady(savedInstanceState: Bundle?) {
        super.onViewReady(savedInstanceState)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.title = "Today's News";

        if (savedInstanceState == null) {
            setupBottomNavigationBar()
        }
        savedInstanceState?.let {
            viewModel.hideErrorToast()
        }

    }

    override fun setBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    private fun setupBottomNavigationBar() {
        data class menuItem(val menuItem: MenuItem, val bitmap: Bitmap)
        val picasso = Picasso.get()
        menuItems.forEachIndexed { index, menuItem ->
            binding.bottomNavigationView.menu.add(Menu.NONE, menuItem.destinationId, index, menuItem.label)
        }
        subscriptions.add(
            Observable.fromIterable(menuItems)
                .switchMap {
                    Observable.just(
                        menuItem(it, picasso.load(it.image).get())
                    )
                }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {
                        val menuItem = binding.bottomNavigationView.menu.findItem(it.menuItem.destinationId)
                        menuItem.icon = BitmapDrawable(resources, it.bitmap)
                    },
                    {
                        // Handle errors here
                    },
                    {
                        val navController = findNavController(R.id.newsNavHostFragment)
                        binding.bottomNavigationView.setupWithNavController(navController)
                    }
                )
        )
    }
}