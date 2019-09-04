package com.yuhei.nhk.repository

import com.yuhei.nhk.api.ProgramRemote
import com.yuhei.nhk.entity.program.ProgramList
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProgramListRepository @Inject constructor(private val remote: ProgramRemote) {

    fun getProgramList(area: String, service: String, date: String, apikey: String): Single<Result<ProgramList>> {
        return remote.getProgramList(area, service, date, apikey)
    }
}
