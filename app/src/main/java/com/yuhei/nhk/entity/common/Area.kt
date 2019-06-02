package com.yuhei.nhk.entity.common

import com.google.gson.annotations.SerializedName

data class Area(
        @SerializedName("id")
        val id: String?,
        @SerializedName("name")
        val name: String?
)
