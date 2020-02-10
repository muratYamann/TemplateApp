package com.yaman.templatepp

import android.app.Activity
import com.yaman.core.application.CoreApp
import com.yaman.templatepp.pages.homefragment.ioc.DaggerHomeFragmentComponent
import com.yaman.templatepp.pages.homefragment.ioc.HomeFragmentComponent
import com.yaman.templatepp.pages.homefragment.ioc.HomeFragmentModule
import javax.inject.Singleton

@Singleton
object ComponentManager {

    private var homeFragmentComponent: HomeFragmentComponent? = null

    fun homeFragmentComponent(activity: Activity): HomeFragmentComponent {
        if (homeFragmentComponent == null)
            homeFragmentComponent = DaggerHomeFragmentComponent.builder()
                    .coreComponent(CoreApp.coreComponent).homeFragmentModule(HomeFragmentModule(activity))
                    .build()
        return homeFragmentComponent as HomeFragmentComponent
    }

    fun destroyhomeFragmentComponent() {
        homeFragmentComponent = null
    }




}
