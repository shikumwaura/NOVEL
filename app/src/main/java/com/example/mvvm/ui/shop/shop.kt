package com.example.mvvm.ui.shop

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.mvvm.navigation.ROUTE_SERVICES


@Composable
fun Shop(navController: NavController){


    LazyColumn() {

        item {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,

                ){
                Text(" this is our shop")


                Text("Services",
                    modifier = Modifier
                        .clickable {navController.navigate(ROUTE_SERVICES)}
                )


































            }
        }


    }




}