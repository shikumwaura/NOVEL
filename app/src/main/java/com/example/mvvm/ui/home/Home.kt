package com.example.mvvm.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.mvvm.navigation.ROUTE_ABOUT
import com.example.mvvm.navigation.ROUTE_SHOP


@Composable
fun Home(navController: NavController){
    Column {





        Text(text = "Home")


        Text(
            "Go to about",
            modifier = Modifier
                .clickable { navController.navigate(ROUTE_ABOUT) }
        )

        Button(onClick = { navController.navigate(ROUTE_ABOUT) }) {

            Text(text = "about")

        }


        Text(
            text = "view shop",
            modifier = Modifier
                .clickable { navController.navigate(ROUTE_SHOP) }

        )


                


    }





}