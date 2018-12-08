package com.zheil.zrndvideo.zrndvideo.presentation.list

import android.arch.lifecycle.ViewModel
import android.util.Log


class ListViewModel: ViewModel() {
    fun onClickFrg() {
        Log.d("MYLOG", "CLICKED ON FRAGMENT!")
    }
}