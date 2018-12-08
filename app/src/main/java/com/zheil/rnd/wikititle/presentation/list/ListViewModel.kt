package com.zheil.rnd.wikititle.presentation.list

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MediatorLiveData
import com.zheil.rnd.wikititle.data.uimodel.UITitleData


class ListViewModel(app: Application): AndroidViewModel(app) {

    private val mInteractor = ListInteractor(app)
    private val mListMapper = ListMapper()

    private val mDataObserved: MediatorLiveData<List<UITitleData>> = MediatorLiveData()
    fun getDataObserved(): LiveData<List<UITitleData>> {
        return mDataObserved
    }

    fun onClickBtn() {
        requestToServer()
    }

    fun requestToServer() {
        mInteractor.getData {
            responseWiki ->
            val uiData = mListMapper.map(responseWiki)
            mDataObserved.postValue(uiData)
        }
    }
}