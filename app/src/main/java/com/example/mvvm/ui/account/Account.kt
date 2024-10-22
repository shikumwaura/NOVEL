package com.example.mvvm.ui.account

import android.accounts.Account
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.mvvm.navigation.ROUTE_SERVICES

@Composable
fun Account(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        ){

    Text("My Account")

        Text("Services",
            modifier = Modifier
                .clickable {navController.navigate(ROUTE_SERVICES)}
        )

























































































     }
}