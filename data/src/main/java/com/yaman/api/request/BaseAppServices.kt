package com.yaman.api.request

import com.yaman.api.response.model.productpagedata.KiehlsProductPageDataResponse
import io.reactivex.Single
import retrofit2.http.*

interface BaseAppServices {


    @Headers("Content-Type:application/json")
    @GET("powerful-wrinkle-reducing-eye-cream?response_type=json")
    fun getKiehlsProductData(): Single<KiehlsProductPageDataResponse>

}

