package com.example.karenderiaapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.MENU_SCREEN
    ) {
        composable(Routes.MENU_SCREEN) {

        }

        composable(Routes.ORDERING_SCREEN) {

        }

        composable(Routes.STATISTICS_SCREEN) {

        }

        composable(Routes.SUMMARY_SCREEN) {

        }
    }
}