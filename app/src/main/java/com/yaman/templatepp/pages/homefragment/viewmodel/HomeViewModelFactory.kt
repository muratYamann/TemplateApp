package com.yaman.templatepp.pages.homefragment.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.yaman.templatepp.pages.homefragment.model.HomeFragmentDataContract
import io.reactivex.disposables.CompositeDisposable

@Suppress("UNCHECKED_CAST")
class HomeViewModelFactory(
        private val repository: HomeFragmentDataContract.Repository,
        private val compositeDisposable: CompositeDisposable
) :
    ViewModelProvider.Factory {
  override fun <T : ViewModel?> create(modelClass: Class<T>): T {
    return HomeViewModel(repository,compositeDisposable) as T
  }
}
