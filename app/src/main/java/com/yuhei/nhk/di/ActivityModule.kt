package com.yuhei.nhk.di

import androidx.lifecycle.ViewModelProvider
import com.yuhei.nhk.MainActivity
import com.yuhei.nhk.ui.program.ProgramListModule
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class ActivityModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @ContributesAndroidInjector(modules = [ProgramListModule::class])
    internal abstract fun contributeMainActivity(): MainActivity
}
