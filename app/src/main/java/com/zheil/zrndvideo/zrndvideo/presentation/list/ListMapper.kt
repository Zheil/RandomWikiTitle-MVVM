package com.zheil.zrndvideo.zrndvideo.presentation.list

import com.zheil.zrndvideo.zrndvideo.data.response.WikiResponce
import com.zheil.zrndvideo.zrndvideo.data.uimodel.UITitleData


class ListMapper {

    fun map(response: WikiResponce): List<UITitleData> {
        val randomList = response.query.random
        val listUiTitle = mutableListOf<UITitleData>()

        randomList!!.forEach {
            listUiTitle.add(UITitleData(it.title))
        }

        return listUiTitle
    }
}