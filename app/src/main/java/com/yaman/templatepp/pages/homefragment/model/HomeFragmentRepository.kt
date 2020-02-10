package com.yaman.templatepp.pages.homefragment.model

import com.yaman.api.response.model.productpagedata.KiehlsProductPageDataResponse
import com.yaman.core.extensions.addTo
import com.yaman.core.extensions.failed
import com.yaman.core.extensions.performOnBackOutOnMain
import com.yaman.core.extensions.success
import com.yaman.core.networking.Result
import com.yaman.core.networking.Scheduler
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.subjects.PublishSubject
import timber.log.Timber


class HomeFragmentRepository(
        private val remote: HomeFragmentDataContract.Remote,
        private val scheduler: Scheduler,
        private val compositeDisposable: CompositeDisposable
) : HomeFragmentDataContract.Repository {


    override fun getKiehlsProductData() {

        remote.getKiehlsProductData().performOnBackOutOnMain(scheduler)
                .doOnError {
                    Timber.i(it)
                }
                .subscribe({
                    kiehlsProductDataResult.success(it)
                }, { error ->
                    handleError(kiehlsProductDataResult, error)
                })
                .addTo(compositeDisposable)
    }

    override val kiehlsProductDataResult: PublishSubject<Result<KiehlsProductPageDataResponse>> = PublishSubject.create()


    override fun <T> handleError(result: PublishSubject<Result<T>>, error: Throwable) {
        result.failed(error)
        Timber.e(error.localizedMessage)
    }

}
