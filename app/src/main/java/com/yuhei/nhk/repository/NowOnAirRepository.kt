package com.yuhei.nhk.repository

import com.yuhei.nhk.api.ProgramRemote
import com.yuhei.nhk.entity.nowonair.NowOnAirList
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NowOnAirRepository @Inject constructor(private val remote: ProgramRemote) {

    fun getNowOnAir(area: String, service: String, apikey: String): Single<Result<NowOnAirList>> {
        return remote.getNowOnAir(area, service, apikey)
    }
}
