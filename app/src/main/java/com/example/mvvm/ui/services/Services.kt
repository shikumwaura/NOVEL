package com.example.mvvm.ui.services

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mvvm.navigation.ROUTE_SERVICES
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Composable
fun Services(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        ){

    Text("Services",
        fontSize = 25.sp,
        color = Color.Black,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .clickable {navController.navigate(ROUTE_SERVICES)}
    )

















































































     }
}

