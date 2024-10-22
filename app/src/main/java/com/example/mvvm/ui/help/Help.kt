package com.example.mvvm.ui.help

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mvvm.navigation.ROUTE_SERVICES

@Composable
fun Help(navController: NavController){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        ){

    Text("Help??")

    Text("Services",
        fontSize = 25.sp,
        color = Color.Black,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .clickable {navController.navigate(ROUTE_SERVICES)}
    )















































































    }
}