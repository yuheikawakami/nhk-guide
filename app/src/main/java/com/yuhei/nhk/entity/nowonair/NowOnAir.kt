package com.yuhei.nhk.entity.nowonair

import com.google.gson.annotations.SerializedName
import com.yuhei.nhk.entity.program.Program

data class NowOnAir(
        @SerializedName("previous")
        val previous: Program,
        @SerializedName("present")
        val present: Program,
        @SerializedName("following")
        val following: Program
)
