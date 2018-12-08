package com.zheil.zrndvideo.zrndvideo.presentation.list

import android.content.Context
import com.zheil.zrndvideo.zrndvideo.data.api.ApiService


class ListInteractor(private val mContext: Context) {
    val mApi = ApiService(mContext)

    fun getData(): List<String> {
        val list = listOf("A", "B", "C", "D", "E", "F")

        return list
    }
}