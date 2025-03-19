package com.example.youpassw.util

import kotlin.random.Random

object GeneradorContrasena {
    private const val CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

    fun generar(longitud: Int = 12): String {
        return buildString {
            repeat(longitud) {
                append(CARACTERES[Random.nextInt(CARACTERES.length)])
            }
        }
    }
} 