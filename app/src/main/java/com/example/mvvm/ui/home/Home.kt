package com.example.mvvm.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.mvvm.navigation.ROUTE_ABOUT
import com.example.mvvm.navigation.ROUTE_HOME
import com.example.mvvm.navigation.ROUTE_INSERT
import com.example.mvvm.navigation.ROUTE_SHOP
import com.example.mvvm.navigation.ROUTE_VIEWPRODUCTS


@Composable
fun Home(navController: NavController){
    Column (
//        horizontalAlignment = Alignment.CenterHorizontally,
        ){

        Text(text = "Home")

        Button(onClick = { navController.navigate(ROUTE_ABOUT) }) {

            Text(text = "about")

        }

        Text(
            text = "view shop",
            modifier = Modifier
                .clickable { navController.navigate(ROUTE_SHOP) }

        )

        AsyncImage(
            model = "https://www.emobilis.ac.ke/images/sliders/slide_7.jpg",
            contentDescription = null,
//            modifier = Modifier
//                .size(80.dp)
        )


        Text(

            "Insert Products",
            fontSize = 20.sp,


            modifier = Modifier
                .clickable { navController.navigate(ROUTE_VIEWPRODUCTS) },

            )


        Text("View Products",
            fontSize = 20.sp,

            modifier = Modifier
                .clickable { navController.navigate(ROUTE_VIEWPRODUCTS) },

        )

































































    }

}