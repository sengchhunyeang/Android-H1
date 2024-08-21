package com.example.viewmodel_android_h1.MyViewModel

import android.service.autofill.UserData
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State
import androidx.lifecycle.viewmodel.compose.viewModel

class MyViewModel : ViewModel() {
    private var inputTextState = mutableStateOf("")
    val inputText: State<String> = inputTextState

    fun onInputTextChange(newText: String) {
        inputTextState.value = newText
    }

    fun onInputTextChange2(newText: String) {
        inputTextState.value = newText

    }

    fun onInputTextChange3(newText: String) {
        inputTextState.value = newText
    }
    fun onInputTextChange4(newText: String){
        inputTextState.value=newText
    }
}

