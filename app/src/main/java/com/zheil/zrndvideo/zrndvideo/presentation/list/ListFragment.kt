package com.zheil.zrndvideo.zrndvideo.presentation.list

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import com.zheil.zrndvideo.zrndvideo.R
import com.zheil.zrndvideo.zrndvideo.base.presentation.BaseFragment
import kotlinx.android.synthetic.main.fragment_main.*


class ListFragment: BaseFragment() {
    override fun setViewModel(): Class<ListViewModel> = ListViewModel::class.java

    override fun setLayoutFragment(): Int = R.layout.fragment_main


    override fun onCreateViewChild() {
        Log.d("MYLOG", "FRAGMENT STARTED")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        myRecycle.layoutManager = LinearLayoutManager(context)
        myRecycle.adapter = ListAdapter(ListInteractor().getData())
    }
}
