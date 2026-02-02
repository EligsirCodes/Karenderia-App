package com.example.karenderiaapp.screens
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.material3.Button
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import com.example.karenderiaapp.data.FakeData
import com.example.karenderiaapp.data.Order


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrderingScreen(onNavigateSummary: () -> Unit) {
    val orders = remember { mutableStateListOf<Order>() }

    Scaffold(
        topBar = { TopAppBar(title = { Text("Ordering") }) }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            LazyColumn(modifier = Modifier.weight(1f)) {
                items(FakeData.menuItems) { item ->
                    Button(
                        onClick = {
                            orders.add(Order(item, 1))
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    ) {
                        Text("Add ${item.name} (₱${item.price})")
                    }
                }
            }

            Button(
                onClick = onNavigateSummary,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("View Summary (${orders.size} items)")
            }
        }
    }
}