package com.nitv.newsapp

import android.app.Application
import com.nitv.newsapp.di.component.AppComponent
import com.nitv.newsapp.di.component.AppModule
import com.nitv.newsapp.di.component.DaggerAppComponent

class MyApplication : Application(){
    lateinit var activityComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        activityComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()

    }
    fun getAppComponent(): AppComponent {
        return activityComponent
    }
}