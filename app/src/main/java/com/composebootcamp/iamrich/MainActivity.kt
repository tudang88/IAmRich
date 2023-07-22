package com.composebootcamp.iamrich

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.composebootcamp.iamrich.ui.theme.IAmRichTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IAmRichTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    IamRichApp("Android")
                }
            }
        }
    }
}

/**
 * Main UI structure of the app
 * should be design here
 */
@Composable
fun IamRichApp(name: String, modifier: Modifier = Modifier) {
    Image(painter = painterResource(id = R.drawable.diamon), contentDescription = "This is a Diamond")
}

@Preview(showBackground = true)
@Composable
fun IamRichPreview() {
    IAmRichTheme {
        IamRichApp("Android")
    }
}