package io.philippeboisney.util.di

import io.philippeboisney.util.UtilViewModel
import io.philippeboisney.util.domain.GetUtilityUseCase
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val featureUtilModule = module {
    factory { GetUtilityUseCase(get()) }
    viewModel { UtilViewModel(get(), get()) }
}