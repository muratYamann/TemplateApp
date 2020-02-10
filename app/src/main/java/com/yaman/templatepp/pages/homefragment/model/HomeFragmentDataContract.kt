package com.yaman.templatepp.pages.homefragment.model

import com.yaman.api.response.model.productpagedata.KiehlsProductPageDataResponse
import com.yaman.core.networking.Result
import io.reactivex.Single
import io.reactivex.subjects.PublishSubject

interface HomeFragmentDataContract {

    interface Repository {
        val kiehlsProductDataResult: PublishSubject<Result<KiehlsProductPageDataResponse>>
        fun getKiehlsProductData()


        fun <T> handleError(result: PublishSubject<Result<T>>, error: Throwable) {}
    }

    interface Remote {
        fun getKiehlsProductData(): Single<KiehlsProductPageDataResponse>

    }

}
