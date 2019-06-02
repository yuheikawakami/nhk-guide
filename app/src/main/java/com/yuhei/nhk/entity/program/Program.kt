package com.yuhei.nhk.entity.program

import com.google.gson.annotations.SerializedName
import com.yuhei.nhk.entity.common.Area
import com.yuhei.nhk.entity.common.Service

data class Program(
        @SerializedName("id")
        val id: String?,
        @SerializedName("event_id")
        val eventId: String?,
        @SerializedName("start_time")
        val startTime: String?,
        @SerializedName("end_time")
        val endTime: String?,
        @SerializedName("area")
        val area: Area?,
        @SerializedName("service")
        val service: Service?,
        @SerializedName("title")
        val title: String?,
        @SerializedName("subtitle")
        val subtitle: String?,
        @SerializedName("genres")
        val genres: List<String>?
)
