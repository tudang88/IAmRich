package com.composebootcamp.iamrich

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IamRichApp(name: String, modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier,
        topBar = { BuildAppBar() }) { contentPadding ->
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Image(
                modifier = Modifier.padding(contentPadding),
                painter = painterResource(id = R.drawable.diamon),
                contentDescription = "This a diamond"
            )
        }
    }
}

/**
 * implement top app bar
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BuildAppBar() {
    CenterAlignedTopAppBar(colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Blue),
        title = { Text("I am Rich", color = Color.White) },
        navigationIcon = {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu", tint = Color.White)
        })
}

@Preview(showBackground = true)
@Composable
fun IamRichPreview() {
    IAmRichTheme {
        IamRichApp("Android")
    }
}