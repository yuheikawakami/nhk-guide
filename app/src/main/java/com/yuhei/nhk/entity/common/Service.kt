package com.yuhei.nhk.entity.common

import com.google.gson.annotations.SerializedName

data class Service(
        @SerializedName("id")
        val id: String?,
        @SerializedName("name")
        val name: String?,
        @SerializedName("logo_s")
        val logo_s: Logo?,
        @SerializedName("logo_m")
        val logo_m: Logo?,
        @SerializedName("logo_l")
        val logo_l: Logo?
)
