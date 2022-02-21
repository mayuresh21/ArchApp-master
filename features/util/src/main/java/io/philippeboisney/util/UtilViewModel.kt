package io.philippeboisney.util

import androidx.lifecycle.*
import io.philippeboisney.common.base.BaseViewModel
import io.philippeboisney.util.domain.GetUtilityUseCase
import io.philippeboisney.repository.AppDispatchers

/**
 * A simple [BaseViewModel] that provide the data and handle logic to communicate with the model
 * for [HomeFragment].
 */
class UtilViewModel(private val getUtilityUseCase: GetUtilityUseCase,
                    private val dispatchers: AppDispatchers) : BaseViewModel() {


}