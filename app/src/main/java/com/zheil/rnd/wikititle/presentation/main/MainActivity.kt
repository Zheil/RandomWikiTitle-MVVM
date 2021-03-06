package com.zheil.rnd.wikititle.presentation.main

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import com.zheil.rnd.wikititle.presentation.list.ListFragment
import com.zheil.rnd.wikititle.R
import com.zheil.rnd.wikititle.base.presentation.BaseActivity
import com.zheil.rnd.wikititle.databinding.ActivityMainBinding

class MainActivity: BaseActivity() {
    override fun setLayoutActivity(): Int = R.layout.activity_main

    override fun setContainer(): Int = R.id.container

    override fun onCreateChild() {
        initDataBinding()
        setupFragment(ListFragment())
    }

    private fun initDataBinding() {
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, setLayoutActivity())
        val myView = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.mainView = myView
        binding.setLifecycleOwner(this)
    }
}