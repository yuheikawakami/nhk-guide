package com.yuhei.nhk.repository

import com.yuhei.nhk.api.ProgramRemote
import com.yuhei.nhk.entity.program.ProgramList
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProgramGenreRepository @Inject constructor(private val remote: ProgramRemote) {

    fun getProgramGenre(area: String, service: String, genre: String, date: String, apikey: String): Single<Result<ProgramList>> {
        return remote.getProgramGenre(area, service, genre, date, apikey)
    }
}
