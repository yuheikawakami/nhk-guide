package com.yuhei.nhk.di

import android.content.Context
import com.yuhei.nhk.App
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Factory
    interface Factory : AndroidInjector.Factory<App>

    @Module
    interface AppContextModule {

        @Binds
        fun bindContext(app: App): Context
    }

    companion object {

        fun factory(): Factory = DaggerAppComponent.factory()
    }
}
