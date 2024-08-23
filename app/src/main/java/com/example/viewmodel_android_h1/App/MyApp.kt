package com.example.viewmodel_android_h1.App

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.viewmodel_android_h1.MyViewModel.InputField

@Composable
fun MyApp() {
    Column(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        horizontalAlignment = Alignment.Start

    ) {
        Row(modifier = Modifier.padding(top = 30.dp, start = 16.dp, end = 16.dp)) {
            Text(
                text = "Register Information", fontWeight = FontWeight.Bold, fontSize = 25.sp
            )
            Spacer(modifier = Modifier.weight(0.1f))
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "UserImage")
        }
        InputField()
    }
}