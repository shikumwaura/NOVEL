package com.example.mvvm.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvm.ui.about.About
import com.example.mvvm.ui.home.Home
import com.example.mvvm.ui.shop.Shop


@Composable
fun AppNavHost(

    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_HOME
){

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {

        composable(ROUTE_ABOUT){

            About(navController = navController )

        }





      composable(ROUTE_HOME){

          Home(navController)

      }

        composable(ROUTE_ABOUT){

            About(navController)


        }


        composable(ROUTE_SHOP){

            Shop(navController)

        }






















































    }
















}