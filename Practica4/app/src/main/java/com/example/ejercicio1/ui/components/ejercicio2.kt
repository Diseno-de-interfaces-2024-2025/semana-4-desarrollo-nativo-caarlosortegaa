package com.example.ejercicio1.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun myButtonText(name: String, modifier: Modifier = Modifier) {
    var mostrarBoton by remember { mutableStateOf("Pulsa Aqui") }
    Column (modifier){
        Button(onClick = {mostrarBoton= "Boton Pulsado"}) {
            Text(mostrarBoton)
        }
    }
}

@Composable
fun MyButtonColor(name: String, color : Color, modifier: Modifier){
    var textoBoton by remember { mutableStateOf(name) }
    var colorBoton by remember { mutableStateOf(Color.Black) }
    var colorText by remember { mutableStateOf(Color.White) }
    var colorBorde by remember { mutableStateOf(BorderStroke(1.dp, Color.Black))}
    var shape by remember { mutableStateOf(RoundedCornerShape(20.dp)) }
    Box (Modifier){
        Button(onClick = {
            textoBoton = "Ha cambiado el texto"
            colorBoton = Color.Cyan
            colorText = Color.Black
            colorBorde = BorderStroke(3.dp, Color.Black)
            shape = RoundedCornerShape(4.dp)
        },
            border = colorBorde,
            colors = ButtonDefaults.buttonColors(
                containerColor = colorBoton),
            shape = shape
            ) {

        }

    }
}