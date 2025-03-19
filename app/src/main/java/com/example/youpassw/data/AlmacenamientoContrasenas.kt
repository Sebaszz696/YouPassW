package com.example.youpassw.data

import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext

class AlmacenamientoContrasenas(private val context: Context) {
    private val nombreArchivo = "contrasenas.txt"

    fun obtenerContrasenas(): Flow<List<Password>> = flow {
        val contrasenas = withContext(Dispatchers.IO) {
            try {
                context.openFileInput(nombreArchivo).bufferedReader().useLines { lines ->
                    lines.map { line ->
                        val (nombre, contrasena) = line.split("|")
                        Password(nombre = nombre, contrasena = contrasena)
                    }.toList()
                }
            } catch (e: Exception) {
                emptyList()
            }
        }
        emit(contrasenas)
    }.flowOn(Dispatchers.IO)

    suspend fun guardarContrasena(password: Password) {
        withContext(Dispatchers.IO) {
            val linea = "${password.nombre}|${password.contrasena}\n"
            context.openFileOutput(nombreArchivo, Context.MODE_APPEND).use {
                it.write(linea.toByteArray())
            }
        }
    }

    suspend fun eliminarContrasena(nombreContrasena: String) {
        withContext(Dispatchers.IO) {
            val contrasenas = context.openFileInput(nombreArchivo).bufferedReader().useLines { lines ->
                lines.filter { it.split("|")[0] != nombreContrasena }.toList()
            }
            context.openFileOutput(nombreArchivo, Context.MODE_PRIVATE).use { out ->
                contrasenas.forEach { contrasena ->
                    out.write("$contrasena\n".toByteArray())
                }
            }
        }
    }
} 