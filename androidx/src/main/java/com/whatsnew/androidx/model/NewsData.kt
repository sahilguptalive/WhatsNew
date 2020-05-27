package com.whatsnew.androidx.model

import com.google.gson.annotations.SerializedName

/**
 * Created by  on 2019-12-01.
 */
class NewsData {

    @SerializedName("title")
    var title: String? = null
    @SerializedName("description")
    var description: String? = null
    @SerializedName("urlToImage")
    var imageUrl: String? = null
    @SerializedName("content")
    var content: String? = null
}