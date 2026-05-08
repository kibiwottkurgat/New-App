package com.joshua.newapp.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SimpleCarBooking() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        // 1. Top Title
        Text(
            text = "Rent a Car",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Find the best ride for today", color = Color.Gray)

        Spacer(modifier = Modifier.height(20.dp))

        // 2. A Simple "Featured" Box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFFE3F2FD), RoundedCornerShape(15.dp)),
            contentAlignment = Alignment.Center
        ) {
            Text("Special Offer: 10% Off SUVs", color = Color(0xFF1976D2))
        }

        Spacer(modifier = Modifier.height(20.dp))

        // 3. List of Cars
        Text(text = "Available Now", fontWeight = FontWeight.SemiBold)

        Spacer(modifier = Modifier.height(10.dp))

        LazyColumn(verticalArrangement = Arrangement.spacedBy(15.dp)) {
            item { CarItem("Tesla Model 3", "$80/day") }
            item { CarItem("Toyota Camry", "$45/day") }
            item { CarItem("Honda Civic", "$40/day") }
            item { CarItem("Ford Explorer", "$65/day") }
        }
    }
}

@Composable
fun CarItem(name: String, price: String) {
    // A simple row with car name on the left and a book button on the right
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF5F5F5), RoundedCornerShape(10.dp))
            .padding(15.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(text = name, fontWeight = FontWeight.Bold)
            Text(text = price, fontSize = 14.sp, color = Color.DarkGray)
        }

        Button(onClick = { /* Do nothing for now */ }) {
            Text("Book Your Ride Now")
        }
    }
}