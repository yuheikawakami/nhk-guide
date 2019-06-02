package com.yuhei.nhk.entity.program

import com.google.gson.annotations.SerializedName

data class ProgramList(
        @SerializedName("list")
        val list: List<Program>?
)
