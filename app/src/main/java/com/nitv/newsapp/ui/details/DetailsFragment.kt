package com.nitv.newsapp.ui.details

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.core.view.isGone
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.nitv.newsapp.MyApplication
import com.nitv.newsapp.base.BaseFragment
import com.nitv.newsapp.databinding.FragmentDetailsBinding
import com.nitv.newsapp.di.Factory.ViewModelFactory
import com.nitv.newsapp.ui.main.MainViewModel
import javax.inject.Inject

 class DetailsFragment : BaseFragment<FragmentDetailsBinding>() {

    override fun setBinding(): FragmentDetailsBinding =
        FragmentDetailsBinding.inflate(layoutInflater)

    lateinit var viewModel: MainViewModel



    val args: DetailsFragmentArgs by navArgs()

     @Inject
     lateinit var viewModelFactory: ViewModelFactory




     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         (requireActivity().application as MyApplication).getAppComponent().inject(this)
         viewModel = ViewModelProviders.of(this,viewModelFactory).get(MainViewModel::class.java)

     }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupUI(view)
        setupObserver()
    }

    private fun setupUI(view: View) {
        val news = args.news
        binding.webView.apply {
            webViewClient = WebViewClient()
            news.url?.let {
                loadUrl(it)
            }
        }

        binding.fab.setOnClickListener {
            viewModel.saveNews(news)
            Snackbar.make(view, "News article saved successfully", Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun setupObserver() {
        viewModel.getFavoriteNews().observe(viewLifecycleOwner) { news ->
            binding.fab.isGone = news.any { it.title == args.news.title }
        }
    }
}