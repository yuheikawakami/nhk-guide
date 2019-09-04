package com.yuhei.nhk.repository

import com.yuhei.nhk.api.ProgramRemote
import com.yuhei.nhk.entity.description.DescriptionList
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProgramInfoRepository @Inject constructor(private val remote: ProgramRemote) {

    fun getProgramInfo(area: String, service: String, id: String, apikey: String): Single<Result<DescriptionList>> {
        return remote.getProgramInfo(area, service, id, apikey)
    }
}
