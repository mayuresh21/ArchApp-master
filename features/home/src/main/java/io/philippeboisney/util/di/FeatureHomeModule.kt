package io.philippeboisney.util.di

import io.philippeboisney.util.HomeViewModel
import io.philippeboisney.util.domain.GetTopUsersUseCase
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val featureHomeModule = module {
    factory { GetTopUsersUseCase(get()) }
    viewModel { HomeViewModel(get(), get()) }
}