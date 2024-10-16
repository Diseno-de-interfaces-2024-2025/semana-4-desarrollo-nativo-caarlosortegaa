package com.example.ejercicio1.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit

@Composable
fun MyText(text: String, fontSize: TextUnit, color: Color, modifier : Modifier) {
    Column(modifier) {
        Text(
            text = text,
            modifier = Modifier,
            style = TextStyle(
                color = color,
                fontSize = fontSize
            )
        )
    }
}