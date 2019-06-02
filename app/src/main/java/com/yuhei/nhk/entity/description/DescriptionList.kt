package com.yuhei.nhk.entity.description

import com.google.gson.annotations.SerializedName

data class DescriptionList(
        @SerializedName("list")
        val list: List<Description>?
)
