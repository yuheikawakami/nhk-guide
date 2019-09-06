package com.yuhei.nhk.di

import androidx.lifecycle.ViewModelProvider
import com.yuhei.nhk.ui.main.MainActivity
import com.yuhei.nhk.ui.main.MainModule
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class ActivityModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @ContributesAndroidInjector(modules = [MainModule::class])
    internal abstract fun contributeMainActivity(): MainActivity
}
