package com.zheil.rnd.wikititle.presentation.list

import com.zheil.rnd.wikititle.data.response.WikiResponce
import com.zheil.rnd.wikititle.data.uimodel.UITitleData


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