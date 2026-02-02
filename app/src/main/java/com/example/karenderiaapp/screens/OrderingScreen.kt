package com.example.karenderiaapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.karenderiaapp.data.FakeData
import com.example.karenderiaapp.data.Order

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrderingScreen(onNavigateSummary: () -> Unit) {
    val orders = remember { mutableStateListOf<Order>() }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Ordering", fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, fontSize = 20.sp) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFFB71C1C),
                    titleContentColor = Color.White
                )
            )
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .padding(16.dp)
            ) {
                LazyColumn(
                    modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(FakeData.menuItems) { item ->
                        // Each menu item as a card with gradient background
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(80.dp),
                            shape = RoundedCornerShape(12.dp),
                            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(
                                        Brush.horizontalGradient(
                                            colors = listOf(Color.Red, Color.Black)
                                        )
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Button(
                                    onClick = { orders.add(Order(item, 1)) },
                                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 0.dp),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Text(
                                        text = "Add ${item.name} (₱${item.price})",
                                        color = Color.White,
                                        fontSize = 16.sp,
                                        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                                    )
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = onNavigateSummary,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFB71C1C))
                ) {
                    Text(
                        text = "View Summary (${orders.size} items)",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                    )
                }
            }
        }
    )
}
