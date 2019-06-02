package com.yuhei.nhk.entity.description

import com.google.gson.annotations.SerializedName
import com.yuhei.nhk.entity.common.Area
import com.yuhei.nhk.entity.common.Extra
import com.yuhei.nhk.entity.common.Logo
import com.yuhei.nhk.entity.common.Service

data class Description(
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
        @SerializedName("content")
        val content: String?,
        @SerializedName("act")
        val act: String?,
        @SerializedName("genres")
        val genres: List<String>?,
        @SerializedName("program_logo")
        val programLogo: Logo?,
        @SerializedName("program_url")
        val programUrl: String?,
        @SerializedName("episode_url")
        val episodeUrl: String?,
        @SerializedName("hashtags")
        val hashtags: List<String>?,
        @SerializedName("extras")
        val extras: Extra?
)
