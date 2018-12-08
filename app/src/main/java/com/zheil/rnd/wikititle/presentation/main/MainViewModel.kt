package com.zheil.rnd.wikititle.presentation.main

import android.arch.lifecycle.ViewModel
import com.zheil.rnd.wikititle.logd


class MainViewModel: ViewModel() {
    fun onClick() {
        logd("MYLOG", "CLICKED!")
    }
}