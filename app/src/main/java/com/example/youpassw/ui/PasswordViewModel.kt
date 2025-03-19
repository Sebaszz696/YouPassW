package com.example.youpassw.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.youpassw.data.Password
import com.example.youpassw.data.AlmacenamientoContrasenas
import com.example.youpassw.util.GeneradorContrasena
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PasswordViewModel(application: Application) : AndroidViewModel(application) {
    private val almacenamiento = AlmacenamientoContrasenas(application)
    private val _contrasenas = MutableStateFlow<List<Password>>(emptyList())
    val contrasenas: StateFlow<List<Password>> = _contrasenas.asStateFlow()

    init {
        viewModelScope.launch {
            almacenamiento.obtenerContrasenas().collect {
                _contrasenas.value = it
            }
        }
    }

    fun guardarContrasena(nombre: String) {
        val contrasenaGenerada = GeneradorContrasena.generar()
        viewModelScope.launch {
            almacenamiento.guardarContrasena(
                Password(
                    nombre = nombre,
                    contrasena = contrasenaGenerada
                )
            )
        }
    }

    fun eliminarContrasena(password: Password) {
        viewModelScope.launch {
            almacenamiento.eliminarContrasena(password.nombre)
        }
    }
} 