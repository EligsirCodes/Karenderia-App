package com.example.karenderiaapp.screens
import androidx.compose.ui.unit.dp
import com.example.karenderiaapp.data.FakeData
import com.example.karenderiaapp.data.Order


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