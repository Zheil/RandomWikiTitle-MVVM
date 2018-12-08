package com.zheil.zrndvideo.zrndvideo.presentation.list

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zheil.zrndvideo.zrndvideo.R
import kotlinx.android.synthetic.main.item_data.view.*


class ListAdapter(private val listData: List<String>): RecyclerView.Adapter<ListViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ListViewHolder {
      val view = LayoutInflater.from(p0.context).inflate(R.layout.item_data, p0, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listData.size

    override fun onBindViewHolder(bind: ListViewHolder, index: Int) {
        bind.text.text = listData[index]
    }

}


class ListViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val text = view.textData
}