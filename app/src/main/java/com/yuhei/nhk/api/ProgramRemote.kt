package com.yuhei.nhk.api

import com.yuhei.nhk.entity.description.DescriptionList
import com.yuhei.nhk.entity.nowonair.NowOnAirList
import com.yuhei.nhk.entity.program.ProgramList
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NowOnAirRemote {

    @GET("list/{area}/{service}/{date}.json?key={apikey}")
    fun getProgramList(@Path("area") area: String,
                       @Path("service") service: String,
                       @Path("date") date: String,
                       @Query("apikey") apikey: String): Single<Result<ProgramList>>

    @GET("genre/{area}/{service}/{genre}/{date}.json?key={apikey}")
    fun getProgramGenre(@Path("area") area: String,
                        @Path("service") service: String,
                        @Path("genre") genre: String,
                        @Path("date") date: String,
                        @Query("apikey") apikey: String): Single<Result<ProgramList>>

    @GET("info/{area}/{service}/{id}.json?key={apikey}")
    fun getProgramInfo(@Path("area") area: String,
                       @Path("service") service: String,
                       @Path("id") id: String,
                       @Query("apikey") apikey: String): Single<Result<DescriptionList>>

    @GET("now/{area}/{service}.json?key={apikey}")
    fun getNowOnAir(@Path("area") area: String,
                    @Path("service") service: String,
                    @Query("apikey") apikey: String): Single<Result<NowOnAirList>>
}
