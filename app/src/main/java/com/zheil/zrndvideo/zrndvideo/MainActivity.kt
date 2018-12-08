package com.zheil.zrndvideo.zrndvideo


import com.zheil.zrndvideo.zrndvideo.base.presentation.BaseActivity

class MainActivity: BaseActivity() {
    override fun setLayoutActivity(): Int = R.layout.activity_main

    override fun setContainer(): Int = R.id.container

    override fun onCreateChild() {
        setupFragment(MainFragment())
    }

}
