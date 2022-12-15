package com.nitv.newsapp.ui.main

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.nitv.newsapp.MyApplication
import com.nitv.newsapp.R
import com.nitv.newsapp.base.BaseActivity
import com.nitv.newsapp.databinding.ActivityMainBinding



class MainActivity : BaseActivity<ActivityMainBinding>() {
    val viewModel: MainViewModel by viewModels()


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
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.newsNavHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bottomNavigationView.setupWithNavController(navController)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.feedFragment,
                R.id.favoriteFragment
            )
        )
        binding.toolbar.setupWithNavController(navController, appBarConfiguration)
    }


}