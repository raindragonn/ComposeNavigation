package com.raindragonn.composenavigation.main

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.raindragonn.composenavigation.home.HomeScreen
import com.raindragonn.composenavigation.navigation.route.Route
import com.raindragonn.composenavigation.second.SecondScreen
import com.raindragonn.composenavigation.ui.theme.ComposeNavigationTheme

@Composable
fun MainScreen(
	navController: NavHostController = rememberNavController(),
	modifier: Modifier = Modifier
) {
	Scaffold(
		modifier = modifier.fillMaxSize(),
		content = { innerPadding ->
			NavHost(
				navController = navController,
				startDestination = Route.HOME,
				modifier = modifier.padding(innerPadding)
			) {
				composable<Route.HOME> {
					LaunchedEffect(it) {
						Log.e("DEV_LOG", "MainScreen_home: $it")
					}
					HomeScreen {
						navController.navigate(Route.SECOND)
					}
				}
				composable<Route.SECOND> {
					LaunchedEffect(it) {
						Log.e("DEV_LOG", "MainScreen_second: $it")
					}
					SecondScreen {
						navController.navigate(Route.HOME)
					}
				}
			}
		}
	)
}


@Preview
@Composable
private fun MainScreenPreview() {
	ComposeNavigationTheme {
		MainScreen()
	}
}
