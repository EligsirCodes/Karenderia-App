package com.example.karenderiaapp.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun StatisticsScreen() {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Statistics") }) }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            Text("Total Sales Today")
            Spacer(modifier = Modifier.height(8.dp))
            Text("₱1,250.00", style = MaterialTheme.typography.headlineMedium)
        }
    }
}