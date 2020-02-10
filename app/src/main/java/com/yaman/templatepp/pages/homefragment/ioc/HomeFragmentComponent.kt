package com.yaman.templatepp.pages.homefragment.ioc

import com.yaman.core.ioc.CoreComponent
import com.yaman.templatepp.pages.homefragment.HomeFragment
import dagger.Component


@HomeFragmentScope
@Component(dependencies = [CoreComponent::class], modules = [HomeFragmentModule::class])
interface HomeFragmentComponent {
    fun inject(homeFragment: HomeFragment)
}