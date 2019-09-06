package com.yuhei.nhk.di

import android.app.Application
import android.content.Context
import com.yuhei.nhk.App
import dagger.Module
import dagger.Provides

@Module(includes = [DataModule::class])
class AppModule {
    @Provides
    fun provideApplication(app: App): Application = app

    @Provides
    fun provideAppContext(app: App): Context = app
}
