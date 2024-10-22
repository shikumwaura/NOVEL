package com.example.mvvm.ui.about

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.mvvm.navigation.ROUTE_ABOUT
import com.example.mvvm.navigation.ROUTE_HOME
import com.example.mvvm.navigation.ROUTE_SERVICES
import com.example.mvvm.navigation.ROUTE_SHOP

@Composable
fun About(navController: NavController){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {

        Text(text = "About screen")

        Text(
            text = "shop",
            modifier= Modifier
                .clickable { navController.navigate(ROUTE_SHOP) }
        )

        Text("Services",
            modifier = Modifier
                .clickable {navController.navigate(ROUTE_SERVICES)}
        )

        Text(
            "Go to home",
            modifier = Modifier
                .clickable { navController.navigate(ROUTE_HOME) }
        )









    }



}