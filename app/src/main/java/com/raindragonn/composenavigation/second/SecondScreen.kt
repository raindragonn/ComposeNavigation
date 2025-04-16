package com.raindragonn.composenavigation.second

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.raindragonn.composenavigation.navigation.route.Route
import com.raindragonn.composenavigation.ui.theme.ComposeNavigationTheme

@Composable
fun SecondScreen(
	route: Route.SECOND,
	modifier: Modifier = Modifier,
	onNavigateToHome: () -> Unit = {},
) {
	Box(
		modifier = modifier.fillMaxSize(),
		contentAlignment = Alignment.Center
	) {
		Text(
			text = "세컨드 화면 입니다.${route.count}",
			style = MaterialTheme.typography.titleLarge,
			modifier = Modifier.clickable(onClick = onNavigateToHome)
		)
	}
}


@Preview(showBackground = true)
@Composable
private fun SecondScreenPreview() {
	ComposeNavigationTheme {
		SecondScreen(Route.SECOND(10))
	}
}
