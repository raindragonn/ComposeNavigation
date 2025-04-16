package com.raindragonn.composenavigation.navigation.route

import kotlinx.serialization.Serializable

sealed interface Route {

	@Serializable
	data class HOME(val count: Int)

	@Serializable
	data class SECOND(val count: Int)
}
