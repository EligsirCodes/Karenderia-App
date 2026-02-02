package com.example.karenderiaapp.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SummaryScreen(onNavigateStats: () -> Unit) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Order Summary") }) }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            Text("Total Orders Today: 8")
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = onNavigateStats) {
                Text("View Statistics")
            }
        }
    }
}