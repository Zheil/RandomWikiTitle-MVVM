package com.zheil.zrndvideo.zrndvideo.presentation.list

import android.util.Log
import com.zheil.zrndvideo.zrndvideo.R
import com.zheil.zrndvideo.zrndvideo.base.presentation.BaseFragment


class ListFragment: BaseFragment() {
    override fun setViewModel(): Class<ListViewModel> = ListViewModel::class.java

    override fun setLayoutFragment(): Int = R.layout.fragment_main


    override fun onCreateViewChild() {
        Log.d("MYLOG", "FRAGMENT STARTED")
    }
}
