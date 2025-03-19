/**
 * YouPassW - Generador de Contraseñas Seguras
 * Elaborado por: Sebastian Velasquez
 * 
 * Aplicación Android para generar y copiar contraseñas seguras.
 * Utiliza Jetpack Compose para la interfaz de usuario y
 * kotlin.random para la generación de contraseñas aleatorias.
 */
package com.example.youpassw

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ClipboardManager
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Actividad principal de la aplicación.
 * Configura la interfaz de usuario utilizando Jetpack Compose.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PantallaGenerador()
                }
            }
        }
    }
}

/**
 * Composable principal que muestra la interfaz del generador de contraseñas.
 * 
 * Características:
 * - Muestra la contraseña generada en texto grande
 * - Botón para generar nueva contraseña
 * - Botón para copiar la contraseña al portapapeles
 * 
 * La interfaz está centrada en la pantalla y usa Material Design 3
 * para mantener una apariencia moderna y consistente.
 */
@Composable
fun PantallaGenerador() {
    // Estado para almacenar la contraseña actual
    var contrasena by remember { mutableStateOf(GeneradorContrasena.generar()) }
    // Acceso al administrador del portapapeles
    val clipboardManager: ClipboardManager = LocalClipboardManager.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Muestra la contraseña generada
            Text(
                text = contrasena,
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Botones de acción
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Botón para generar nueva contraseña
                Button(onClick = { contrasena = GeneradorContrasena.generar() }) {
                    Text("Generar Nueva")
                }

                // Botón para copiar al portapapeles
                Button(onClick = { clipboardManager.setText(AnnotatedString(contrasena)) }) {
                    Text("Copiar")
                }
            }
        }

        // Texto de elaborado por en la parte inferior
        Text(
            text = "Elaborado por: Sebastian Velasquez",
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp),
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            fontSize = 14.sp
        )
    }
}