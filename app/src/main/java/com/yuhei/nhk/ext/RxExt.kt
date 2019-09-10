package com.yuhei.nhk.ext

import com.yuhei.nhk.api.ApiResult
import io.reactivex.Single
import retrofit2.adapter.rxjava2.Result

fun <T> Single<Result<T>>.mapApiResult(): Single<ApiResult<T>> = map { ApiResult.handle(it) }
