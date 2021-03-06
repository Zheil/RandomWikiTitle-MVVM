package com.zheil.rnd.wikititle.presentation.list

import android.content.Context
import android.util.Log
import com.zheil.rnd.wikititle.data.api.ApiService
import com.zheil.rnd.wikititle.data.response.WikiResponce


class ListInteractor(private val mContext: Context) {
    private val mApi = ApiService(mContext)

    fun getData(onSuccess: (response: WikiResponce) -> Unit) {
        mApi.getWiki({ success->
            onSuccess(success)
        }, {error -> Log.d("MYLOG", "ERROR ${error}")})

       // val list = listOf("A", "B", "C", "D", "E", "F")
        //return list
    }
}