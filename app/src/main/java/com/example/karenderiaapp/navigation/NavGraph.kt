package com.example.karenderiaapp.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.karenderiaapp.screens.*


@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.MENU_SCREEN
    ) {
        composable(Routes.MENU_SCREEN) {
            MenuScreen(onNavigateOrder = {
                navController.navigate(Routes.ORDERING_SCREEN)
            })
        }


        composable(Routes.ORDERING_SCREEN) {
            OrderingScreen(onNavigateSummary = {
                navController.navigate(Routes.SUMMARY_SCREEN)
            })
        }


        composable(Routes.STATISTICS_SCREEN) {
            StatisticsScreen()
        }


        composable(Routes.SUMMARY_SCREEN) {
            SummaryScreen(onNavigateStats = {
                navController.navigate(Routes.STATISTICS_SCREEN)
            })
        }
    }
}