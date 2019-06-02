package com.yuhei.nhk.entity.nowonair

import com.google.gson.annotations.SerializedName

data class NowOnAirList(
        @SerializedName("nowonair_list")
        val nowonairList: List<NowOnAir>?
)
