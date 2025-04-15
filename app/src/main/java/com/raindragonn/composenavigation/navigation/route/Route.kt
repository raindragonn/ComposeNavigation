package com.raindragonn.composenavigation.navigation.route

import kotlinx.serialization.Serializable

sealed interface Route {

	@Serializable
	data object HOME

	@Serializable
	data object SECOND
}
