package com.yuhei.nhk.entity.common

import com.google.gson.annotations.SerializedName

data class Link(
        @SerializedName("url")
        val url: String?,
        @SerializedName("title")
        val title: String?,
        @SerializedName("id")
        val id: String?
)
