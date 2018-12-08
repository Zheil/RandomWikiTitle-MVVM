package com.zheil.zrndvideo.zrndvideo.data.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ResponseModel {
}

data class Continue (
    @SerializedName("rncontinue") var rncontinue: String,
    @SerializedName("continue") var queryContinue: String )

data class WikiResponce (
    @SerializedName("batchcomplete") var batchcomplete:String,
    @SerializedName("continue") var _continue:Continue,
    @SerializedName("query") var query:Query
)
data class Query (
    @SerializedName("random") @Expose var random:List<Random>? = null
)

data class Random (
    @SerializedName("id") var id:Int,
    @SerializedName("ns") var ns:Int,
    @SerializedName("title") var title:String
)
