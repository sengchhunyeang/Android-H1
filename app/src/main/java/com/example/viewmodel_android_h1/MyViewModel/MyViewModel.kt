package com.example.viewmodel_android_h1.MyViewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State
import com.example.viewmodel_android_h1.User.UserInputState

class MyViewModel : ViewModel() {
    private val inputState = mutableStateOf(UserInputState())
    val userInputState: State<UserInputState> = inputState
    fun onInputTextState(newText: String, field: String) {
        inputState.value = when (field) {
            "fullName" -> userInputState.value.copy(fullName = newText)
            "gender" -> userInputState.value.copy(gender = newText)
            "phone" -> userInputState.value.copy(phone = newText)
            "address" -> inputState.value.copy(address = newText)
            else -> {
                inputState.value
            }
        }
    }
}

