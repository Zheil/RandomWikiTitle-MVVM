package com.zheil.zrndvideo.zrndvideo.base.presentation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


abstract class BaseFragment: Fragment() {

    abstract fun setLayoutFragment(): Int
    open fun onCreateViewChild() {}

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = LayoutInflater.from(context).inflate(setLayoutFragment(), container, false)
        onCreateViewChild()
        return view
    }
}