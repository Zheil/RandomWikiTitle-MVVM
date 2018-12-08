package com.zheil.zrndvideo.zrndvideo.data.api

import android.content.Context
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.zheil.zrndvideo.zrndvideo.Const
import com.zheil.zrndvideo.zrndvideo.data.response.WikiResponce


class ApiService(private val mContext: Context) {

    private val mApi = Volley.newRequestQueue(mContext)

    fun getWiki(
            onSuccess: (response: WikiResponce) -> Unit,
            onFail: (error: String) -> Unit) {
        val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, Const.endpoint, null,
                Response.Listener { response ->
                    val gson = Gson().fromJson(response.toString(), WikiResponce::class.java)
                    onSuccess(gson)
                },
                Response.ErrorListener { error ->
                    onFail(error.toString())
                }
        )
        mApi.add(jsonObjectRequest)
    }
}