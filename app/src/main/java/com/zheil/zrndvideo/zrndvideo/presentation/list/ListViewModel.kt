package com.zheil.zrndvideo.zrndvideo.presentation.list

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.util.Log
import com.zheil.zrndvideo.zrndvideo.data.api.ApiService
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MediatorLiveData




class ListViewModel(app: Application): AndroidViewModel(app) {

    private val mInteractor = ListInteractor(app)

    private val mDataObserved: MediatorLiveData<List<String>> = MediatorLiveData()
    fun getDataObserved(): LiveData<List<String>> {
        return mDataObserved
    }

    fun onClickFrg() {
        Log.d("MYLOG", "CLICKED ON FRAGMENT!")
    }


    fun requestToServer() {
        val data = mInteractor.getData()
        mDataObserved.postValue(data)

    }
}