package com.yuhei.nhk.entity.common

import com.google.gson.annotations.SerializedName

data class Logo(
        @SerializedName("url")
        val url: String?,
        @SerializedName("width")
        val width: String?,
        @SerializedName("height")
        val height: String?
)
