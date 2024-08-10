package com.example.apias.commons

import java.lang.Exception

open class Result<out T> {
    data object Loading: Result<Nothing>()
    data class Success<out T>(val data: T): Result<T>()
    data class Error(val exception: Exception): Result<Nothing>()
}