package com.zheil.zrndvideo.zrndvideo.presentation.list

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import com.zheil.zrndvideo.zrndvideo.R
import com.zheil.zrndvideo.zrndvideo.base.presentation.BaseFragment
import com.zheil.zrndvideo.zrndvideo.data.response.WikiResponce
import com.zheil.zrndvideo.zrndvideo.data.uimodel.UITitleData
import com.zheil.zrndvideo.zrndvideo.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.fragment_main.*


class ListFragment: BaseFragment() {
    private lateinit var mModelViewModel: ListViewModel

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
        myRecycle.adapter = ListAdapter(listOf())
    }

    private fun initObserve() {
        mModelViewModel.getDataObserved().observe(this, Observer<List<UITitleData>> {
            t -> Log.d("MYLOG", "OBSERVER = ${t!!.toString()}") }

        )
    }
}
