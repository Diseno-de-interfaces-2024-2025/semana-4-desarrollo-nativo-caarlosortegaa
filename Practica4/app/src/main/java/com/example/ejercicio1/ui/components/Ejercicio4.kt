package com.example.ejercicio1.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Ejercicio4(modifier: Modifier){
    Column(Modifier.fillMaxSize()) {
        Spacer(Modifier.height(53.dp))
        Box(
            Modifier.fillMaxWidth().weight(0.4f).background(Color.Black),
            contentAlignment = Alignment.Center){
            Text(text = "Screen", color = Color.White, fontSize = 30.sp,textAlign = TextAlign.Center,)
        }
        Box(Modifier.fillMaxWidth().weight(0.3f).background(Color.LightGray)){}

        Spacer(Modifier.weight(0.2f))
        Row(Modifier.fillMaxSize().weight(1f).padding(10.dp)){
            Box(Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.Blue))
            Spacer(Modifier.width(20.dp))
            Box(Modifier.fillMaxSize().weight(1f).background(Color.White)){
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam finibus ac ante non fringilla. Curabitur ornare malesuada hendrerit. Etiam ullamcorper enim ex, sit amet varius tellus aliquet nec. Etiam vitae aliquam quam, et volutpat sem. Vestibulum accumsan turpis a turpis ullamcorper, id facilisis ex placerat. Mauris ac scelerisque sapien, vel posuere neque. Aenean tempus magna sit amet sapien vehicula, non vulputate mi eleifend. Cras fringilla enim non justo scelerisque, nec congue ipsum scelerisque. Donec auctor arcu et augue pharetra, sit amet accumsan orci fermentum. Nam nec diam nec nulla mollis dapibus at quis nulla. Sed feugiat, elit nec iaculis auctor, ligula tortor laoreet purus, id tristique orci mi id enim. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Integer luctus leo eget leo lobortis interdum.\n")
            }
        }
        Spacer(Modifier.weight(1f))
        Box(Modifier.fillMaxSize().weight(1f).background(Color.Green))
    }
}