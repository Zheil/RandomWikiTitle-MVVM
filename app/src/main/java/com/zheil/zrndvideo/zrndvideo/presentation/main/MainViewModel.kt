package com.zheil.zrndvideo.zrndvideo.presentation.main

import android.arch.lifecycle.ViewModel
import com.zheil.zrndvideo.zrndvideo.logd


class MainViewModel: ViewModel() {
    fun onClick() {
        logd("MYLOG", "CLICKED!")
    }
}