package com.yuhei.nhk.di

import android.content.Context
import com.yuhei.nhk.ui.MainActivity
import com.yuhei.nhk.ui.MainFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainActivityModule {

    @Binds
    fun bindAppCompatActivity(activity: MainActivity): Context

    @ContributesAndroidInjector
    fun contributeMainFragment(): MainFragment
}
