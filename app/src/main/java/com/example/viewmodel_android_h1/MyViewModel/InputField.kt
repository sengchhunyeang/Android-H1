package com.example.viewmodel_android_h1.MyViewModel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun InputField() {
    val viewModel: MyViewModel = viewModel()
    val userInputState by viewModel.userInputState

    val isAnyInputEmpty =
        userInputState.fullName.isEmpty() || userInputState.gender.isEmpty() || userInputState.phone.isEmpty() || userInputState.address.isEmpty()

    OutlinedTextField(value = userInputState.fullName,
        onValueChange = { newInputText ->
            viewModel.onInputTextState(newInputText, "fullName")
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp),
        label = { Text("Full Name") },
        placeholder = { Text(text = "Chhunyeang") })



    Row(modifier = Modifier.fillMaxWidth()) {
        OutlinedTextField(
            value = userInputState.gender,
            onValueChange = { newInputText ->
                viewModel.onInputTextState(newInputText, "gender")
            },
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp, end = 10.dp),
            label = { Text("Gender") },
            placeholder = { Text(text = "Male") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        OutlinedTextField(
            value = userInputState.phone,
            onValueChange = { newInputText ->
                viewModel.onInputTextState(newInputText, "phone")
            },
            modifier = Modifier
                .weight(2f)
                .padding(start = 1.dp, end = 16.dp),
            label = { Text("Phone") },
            placeholder = { Text(text = "0963042761") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        )
    }
    Row(modifier = Modifier.padding(start = 16.dp, end = 16.dp)) {
        OutlinedTextField(value = userInputState.address,
            onValueChange = { newInputText ->
                viewModel.onInputTextState(newInputText, "address")
            },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Address") },
            placeholder = { Text(text = "PP") })
    }
    Row(
        modifier = Modifier.padding(10.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isAnyInputEmpty) Color.Gray else Color.Blue,

                )
        ) {
            Text("Submit")
        }
    }
}


