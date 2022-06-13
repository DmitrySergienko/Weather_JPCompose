package com.example.weather_jpcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.weather_jpcompose.ui.theme.Weather_JPComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Weather_JPComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

//@Preview(showBackground = true)
@Composable
fun Greeting(name: String) {

    val state = remember{
        mutableStateOf("Unknown")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ) {

            Text( text = "Temperature in $name = ${state.value}" )
        }
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .background(Color.Yellow),
            contentAlignment = Alignment.Center
        ) {
            Button(onClick = { /*TODO*/ },

                ) {
                Text(text = "Hello $name!")
            }
        }

    }

}

 @Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Weather_JPComposeTheme {
        Greeting("Android")
    }
}
