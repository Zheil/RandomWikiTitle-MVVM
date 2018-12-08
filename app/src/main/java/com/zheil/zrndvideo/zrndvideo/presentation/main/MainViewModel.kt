package com.zheil.zrndvideo.zrndvideo.presentation.main

import android.arch.lifecycle.ViewModel
import android.util.Log


class MainViewModel: ViewModel() {
    fun onClick() {
        Log.d("MYLOG", "CLICKED!")
    }
}