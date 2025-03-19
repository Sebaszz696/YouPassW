/**
 * YouPassW - Generador de Contraseñas Seguras
 * Elaborado por: Sebastian Velasquez
 * 
 * Esta clase proporciona funcionalidad para generar contraseñas seguras
 * utilizando una combinación de caracteres que incluye:
 * - Letras minúsculas (a-z)
 * - Letras mayúsculas (A-Z)
 * - Números (0-9)
 * - Caracteres especiales (!@#$%^&*)
 */
package com.example.youpassw

import kotlin.random.Random

object GeneradorContrasena {
    /**
     * Conjunto de caracteres utilizados para generar las contraseñas.
     * Incluye letras (mayúsculas y minúsculas), números y caracteres especiales
     * para garantizar contraseñas seguras.
     */
    private const val CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*"

    /**
     * Genera una contraseña aleatoria usando el conjunto de caracteres definido.
     * 
     * @param longitud La longitud deseada de la contraseña. Por defecto es 12 caracteres.
     * @return Una cadena que contiene la contraseña generada aleatoriamente.
     */
    fun generar(longitud: Int = 12): String {
        return buildString {
            repeat(longitud) {
                append(CARACTERES[Random.nextInt(CARACTERES.length)])
            }
        }
    }
} 