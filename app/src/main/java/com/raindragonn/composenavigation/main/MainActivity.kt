package com.raindragonn.composenavigation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.raindragonn.composenavigation.ui.theme.ComposeNavigationTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			ComposeNavigationTheme {
				val navController: NavHostController = rememberNavController()
				MainScreen(
					navController = navController
				)
			}
		}
	}
}
