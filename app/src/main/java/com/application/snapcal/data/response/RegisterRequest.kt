package com.application.snapcal.data.response

data class RegisterRequest(
	val name: String,
	val email: String,
	val password: String
)

data class RegisterResponse(
	val status: String,
	val message: String
)
