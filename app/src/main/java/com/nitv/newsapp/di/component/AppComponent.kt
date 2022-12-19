package com.nitv.newsapp.di.component

import com.nitv.newsapp.di.Module.*
import com.nitv.newsapp.ui.details.DetailsFragment
import com.nitv.newsapp.ui.favorite.FavoriteFragment
import com.nitv.newsapp.ui.feed.FeedFragment
import com.nitv.newsapp.ui.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, RepositoryModule::class, ViewModelFactoryModule::class, ViewModelModule::class, AppModule::class])
interface AppComponent {
        fun inject(activity: MainActivity)
        fun inject(fragment: DetailsFragment)
        fun inject(fragment: FavoriteFragment)
        fun inject(fragment: FeedFragment)
}