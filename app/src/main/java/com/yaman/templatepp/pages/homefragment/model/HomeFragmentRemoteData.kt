package com.yaman.templatepp.pages.homefragment.model

import com.yaman.api.request.BaseAppServices
import com.yaman.api.response.model.productpagedata.KiehlsProductPageDataResponse
import io.reactivex.Single


class HomeFragmentRemoteData(private val baseAppServices: BaseAppServices) : HomeFragmentDataContract.Remote {


    override fun getKiehlsProductData(): Single<KiehlsProductPageDataResponse> {
        val url ="https://www.kiehls.com.tr/powerful-wrinkle-reducing-eye-cream?response_type=json/"
        return baseAppServices.getKiehlsProductData()
    }


}