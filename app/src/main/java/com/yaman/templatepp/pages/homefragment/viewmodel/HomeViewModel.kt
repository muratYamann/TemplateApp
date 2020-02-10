package com.yaman.templatepp.pages.homefragment.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.yaman.api.response.model.productpagedata.KiehlsProductPageDataResponse
import com.yaman.core.extensions.toLiveData
import com.yaman.core.networking.Result
import com.yaman.templatepp.ComponentManager
import com.yaman.templatepp.pages.homefragment.model.HomeFragmentDataContract
import io.reactivex.disposables.CompositeDisposable

class HomeViewModel(
        val repository: HomeFragmentDataContract.Repository,
        private val compositeDisposable: CompositeDisposable
) : ViewModel() {


    val homeServicesResult: LiveData<Result<KiehlsProductPageDataResponse>> by lazy {
        repository.kiehlsProductDataResult.toLiveData(compositeDisposable)
    }


    fun getKiehlsProductData() {
        repository.getKiehlsProductData()
    }


    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
        ComponentManager.destroyhomeFragmentComponent()
    }


}
