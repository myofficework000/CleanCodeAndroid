package com.pathak.cleancodearchitecturedemo1.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pathak.cleancodearchitecturedemo1.domain.dto.DogDomain
import com.pathak.cleancodearchitecturedemo1.domain.usecase.DogUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DogViewModel @Inject constructor(private val useCase: DogUseCase) : ViewModel() {

    var dogInfo by mutableStateOf<DogDomain?>(null)
        private set

    fun fetchRandomDog() {
        viewModelScope.launch(Dispatchers.IO) {
            dogInfo = useCase.invoke()
        }
    }
}