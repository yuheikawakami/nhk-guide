package com.yuhei.nhk.entity.common

import com.google.gson.annotations.SerializedName

data class Extra(
        @SerializedName("ondemand_program")
        val ondemandProgram: Link?,
        @SerializedName("ondemand_episode")
        val ondemandEpisode: Link?
)
