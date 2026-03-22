package com.example.midterm

// Android lifecycle + activity setup
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

// Compose UI layout components
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding

// Material UI components
import androidx.compose.material3.Button
import androidx.compose.material3.Text

// State management
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable

// UI alignment & styling
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Main entry point of the app
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterScreen()
        }
    }
}

// Composable function
@Composable
fun CounterScreen() {
    // State variable for counter, rememberSaveable keeps state during recomposition AND screen rotation
    var count by rememberSaveable { mutableStateOf(0) }

    // Column layout to arrange elements vertically
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Display the current count
        Text(
            text = count.toString(),
            fontSize = 32.sp
        )

        // Button to increment count
        Button(
            onClick = { count++ },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Increment")
        }

        // Button to reset count to 0
        Button(
            onClick = { count = 0 },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Reset")
        }
    }
}