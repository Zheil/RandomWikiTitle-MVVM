package com.zheil.zrndvideo.zrndvideo.presentation.main


import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import com.zheil.zrndvideo.zrndvideo.presentation.list.MainFragment
import com.zheil.zrndvideo.zrndvideo.R
import com.zheil.zrndvideo.zrndvideo.base.presentation.BaseActivity
import com.zheil.zrndvideo.zrndvideo.databinding.ActivityMainBinding

class MainActivity: BaseActivity() {
    override fun setLayoutActivity(): Int = R.layout.activity_main

    override fun setContainer(): Int = R.id.container

    override fun onCreateChild() {
        initDataBinding()
        setupFragment(MainFragment())
    }


    private fun initDataBinding() {
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, setLayoutActivity())
        val myView = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.mainView = myView
        binding.setLifecycleOwner(this)

    }

    private fun initDataBinding2() {
       /* val activityBinding: ActivityMainBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_main)
        val myView = ViewModelProviders.of(this).get(DataViewModel::class.java)
        activityBinding.myView = myView
        activityBinding.setLifecycleOwner(this)*/
    }

}
