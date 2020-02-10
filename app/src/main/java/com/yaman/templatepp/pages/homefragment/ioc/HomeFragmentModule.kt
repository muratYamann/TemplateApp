package com.yaman.templatepp.pages.homefragment.ioc


import android.app.Activity
import com.yaman.api.request.BaseAppServices
import com.yaman.core.networking.Scheduler
import com.yaman.templatepp.pages.homefragment.model.HomeFragmentDataContract
import com.yaman.templatepp.pages.homefragment.model.HomeFragmentRemoteData
import com.yaman.templatepp.pages.homefragment.model.HomeFragmentRepository
import com.yaman.templatepp.pages.homefragment.viewmodel.HomeViewModelFactory
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import retrofit2.Retrofit

@Module
@HomeFragmentScope
class HomeFragmentModule(private val activity: Activity) {


    @Provides
    fun homeRepo(remote: HomeFragmentDataContract.Remote, scheduler: Scheduler, compositeDisposable: CompositeDisposable)
            : HomeFragmentDataContract.Repository = HomeFragmentRepository(remote, scheduler, compositeDisposable)

    @Provides
    fun homeViewModelFactory(
            repository: HomeFragmentDataContract.Repository,
            compositeDisposable: CompositeDisposable
    ): HomeViewModelFactory {
        return HomeViewModelFactory(repository, compositeDisposable)
    }

    @Provides
    fun remoteData(loginService: BaseAppServices): HomeFragmentDataContract.Remote = HomeFragmentRemoteData(loginService)


    @Provides
    fun homeService(retrofit: Retrofit): BaseAppServices = retrofit.create(BaseAppServices::class.java)




    @Provides
    fun compositeDisposable(): CompositeDisposable = CompositeDisposable()


}