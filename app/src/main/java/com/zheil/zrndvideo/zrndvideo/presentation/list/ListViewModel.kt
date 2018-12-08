package com.zheil.zrndvideo.zrndvideo.presentation.list

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.util.Log
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MediatorLiveData
import com.zheil.zrndvideo.zrndvideo.data.uimodel.UITitleData


class ListViewModel(app: Application): AndroidViewModel(app) {

    private val mInteractor = ListInteractor(app)
    private val mListMapper = ListMapper()

    private val mDataObserved: MediatorLiveData<List<UITitleData>> = MediatorLiveData()
    fun getDataObserved(): LiveData<List<UITitleData>> {
        return mDataObserved
    }

    fun onClickFrg() {
        Log.d("MYLOG", "CLICKED ON FRAGMENT!")
    }


    fun requestToServer() {
        mInteractor.getData {
            responseWiki ->
            val uiData = mListMapper.map(responseWiki)
            mDataObserved.postValue(uiData)
        }
    }
}