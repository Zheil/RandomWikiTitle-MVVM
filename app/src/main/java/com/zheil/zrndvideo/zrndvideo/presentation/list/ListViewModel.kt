package com.zheil.zrndvideo.zrndvideo.presentation.list

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.ViewModel
import android.util.Log
import com.zheil.zrndvideo.zrndvideo.data.api.ApiService


class ListViewModel(app: Application): AndroidViewModel(app) {

    private val mApi = ApiService(app)

    fun onClickFrg() {
        Log.d("MYLOG", "CLICKED ON FRAGMENT!")
    }

    fun requestToServer() {
        mApi.getWiki()
    }
}