package com.zheil.zrndvideo.zrndvideo.presentation.list

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zheil.zrndvideo.zrndvideo.R
import com.zheil.zrndvideo.zrndvideo.data.uimodel.UITitleData
import com.zheil.zrndvideo.zrndvideo.databinding.ItemDataBinding


class ListAdapter(private val listData: List<UITitleData>): RecyclerView.Adapter<ListViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ListViewHolder {
      val view = LayoutInflater.from(p0.context).inflate(R.layout.item_data, p0, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listData.size

    override fun onBindViewHolder(bind: ListViewHolder, index: Int) {
        bind.mBinding.viewModel = listData[index]
    }
}


class ListViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val mBinding: ItemDataBinding = DataBindingUtil.bind(view)!!
}