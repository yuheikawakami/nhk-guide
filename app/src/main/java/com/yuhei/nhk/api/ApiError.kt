package com.yuhei.nhk.api

import android.content.Context
import com.yuhei.nhk.R
import com.yuhei.nhk.ext.maybe

data class ApiError(
    val code: Int? = null,
    val titleRes: Int? = R.string.api_error_title,
    val messageRes: Int? = R.string.api_error_message,
    val messageStr: String? = null
) {
    fun getMessage(context: Context?): String {
        messageStr?.let { return it }

        val res = messageRes.maybe(0)
        if (res != 0) {
            return context?.getString(res) ?: ""
        }
        return ""
    }

    fun withMesssage(message: String) = copy(messageStr = message)
}
