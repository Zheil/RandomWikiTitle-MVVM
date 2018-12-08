package com.zheil.rnd.wikititle.presentation.list

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.zheil.rnd.wikititle.R
import com.zheil.rnd.wikititle.base.presentation.BaseFragment
import com.zheil.rnd.wikititle.data.uimodel.UITitleData
import com.zheil.rnd.wikititle.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.fragment_main.*


class ListFragment: BaseFragment() {
    private lateinit var mModelViewModel: ListViewModel
    private val mAdapter = ListAdapter(listOf())

    override fun setViewModel(): Class<ListViewModel> = ListViewModel::class.java

    override fun setLayoutFragment(): Int = R.layout.fragment_main

    override fun onCreateViewChild(binding: FragmentMainBinding) {
        val modelView = ViewModelProviders.of(this).get(ListViewModel::class.java)
        binding.viewFragment = modelView

        mModelViewModel = modelView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initObserve()

        startRequest()
    }

    private fun startRequest() {
        mModelViewModel.requestToServer()
    }

    private fun initView() {
        myRecycle.layoutManager = LinearLayoutManager(context)
        myRecycle.adapter = mAdapter
    }

    private fun initObserve() {
        mModelViewModel.getDataObserved().observe(this, Observer<List<UITitleData>> {
            responseUiList -> mAdapter.updateList(responseUiList!!)
        })
    }
}