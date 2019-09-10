package com.yuhei.nhk.api

import retrofit2.adapter.rxjava2.Result
import timber.log.Timber

sealed class ApiResult<out T>(
    val error: ApiError? = null,
    val body: T? = null
) {
    class Success<out T>(body: T) : ApiResult<T>(body = body)

    class Failure<out T>(error: ApiError) : ApiResult<T>(error = error)

    companion object {

        fun <T> handle(result: Result<T>): ApiResult<T> {
            if (result.isError) {
                val e = result.error()
                Timber.w("HTTP request failed. ${e!!.message} ")

                return Failure(ApiError())
            }

            val response = result.response()!!
            if (!response.isSuccessful) {
                val errorResponse = response.errorBody()
                Timber.w("HTTP request not successful. ${response.code()}, ${errorResponse!!.string()}")

                return Failure(ApiError(response.code()))
            }
            return Success(response.body()!!)
        }
    }
}
