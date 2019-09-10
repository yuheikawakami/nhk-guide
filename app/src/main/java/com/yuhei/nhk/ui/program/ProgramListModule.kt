package com.yuhei.nhk.ui.program

import androidx.lifecycle.ViewModel
import com.yuhei.nhk.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class ProgramListModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProgramListViewModel::class)
    abstract fun bindMainViewModel(viewModel: ProgramListViewModel): ViewModel

    @ContributesAndroidInjector
    abstract fun contributeMainFragment(): ProgramListFragment
}
