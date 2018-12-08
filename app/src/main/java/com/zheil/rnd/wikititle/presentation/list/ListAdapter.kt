package com.zheil.rnd.wikititle.presentation.list

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zheil.rnd.wikititle.R
import com.zheil.rnd.wikititle.data.uimodel.UITitleData
import com.zheil.rnd.wikititle.databinding.ItemDataBinding


class ListAdapter(private var listData: List<UITitleData>): RecyclerView.Adapter<ListViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ListViewHolder {
      val view = LayoutInflater.from(p0.context).inflate(R.layout.item_data, p0, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listData.size

    override fun onBindViewHolder(bind: ListViewHolder, index: Int) {
        bind.mBinding.viewModel = listData[index]
    }

    fun updateList(newList: List<UITitleData>) {
        listData = newList
        notifyDataSetChanged()
    }
}

class ListViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val mBinding: ItemDataBinding = DataBindingUtil.bind(view)!!
}