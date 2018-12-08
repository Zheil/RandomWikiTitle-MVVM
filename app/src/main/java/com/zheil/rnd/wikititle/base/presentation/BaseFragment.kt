package com.zheil.rnd.wikititle.base.presentation

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zheil.rnd.wikititle.databinding.FragmentMainBinding
import com.zheil.rnd.wikititle.presentation.list.ListViewModel


abstract class BaseFragment: Fragment() {

    abstract fun setLayoutFragment(): Int
    abstract fun setViewModel():  Class<ListViewModel>
    open fun onCreateViewChild(binding: FragmentMainBinding) {}

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentMainBinding = DataBindingUtil.inflate(inflater, setLayoutFragment(), container, false)
        onCreateViewChild(binding)
        binding.setLifecycleOwner(this)
        return binding.root
    }
}