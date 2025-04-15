package com.raindragonn.composenavigation.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.raindragonn.composenavigation.ui.theme.ComposeNavigationTheme

@Composable
fun HomeScreen(
	modifier: Modifier = Modifier,
	onNavigateToSecond: () -> Unit = {},
) {
	Box(
		modifier = modifier.fillMaxSize(),
		contentAlignment = Alignment.Center
	) {
		Text(
			text = "홈 화면 입니다.",
			style = MaterialTheme.typography.titleLarge,
			modifier = Modifier.clickable(onClick = onNavigateToSecond)
		)
	}
}


@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
	ComposeNavigationTheme {
		HomeScreen()
	}
}
