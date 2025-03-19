# YouPassW - Generador de Contraseñas Seguras

Programación de Dispositivos Móviles

Sebastian Velasquez

Universidad Autónoma Latinoamericana

Marzo de 2024

## 1. DESCRIPCIÓN DE LA APLICACIÓN

YouPassW es una aplicación Android moderna y minimalista diseñada para generar contraseñas seguras de forma rápida y eficiente. Desarrollada como parte del curso de Programación de Dispositivos Móviles, esta aplicación implementa las mejores prácticas de desarrollo en Android utilizando Jetpack Compose para una interfaz de usuario moderna y fluida.

## 2. CAPTURAS DE PANTALLA DE LA APLICACIÓN

### Pantalla Principal
- Interfaz minimalista y moderna
- Visualización clara de la contraseña generada
- Botones de acción intuitivos
- Diseño centrado y limpio

### Funcionalidades Principales
- Generación instantánea de contraseñas seguras
- Función de copiado al portapapeles con un solo toque
- Interfaz adaptativa que funciona en diferentes tamaños de pantalla
- Diseño Material Design 3 para una experiencia visual moderna

## 3. ESTRUCTURA DEL PROYECTO

El proyecto está organizado en los siguientes componentes principales:

### Archivos Principales:
- `MainActivity.kt`: Actividad principal y configuración de la UI
- `GeneradorContrasena.kt`: Lógica de generación de contraseñas
- `ui/theme/`: Temas y estilos de la aplicación

### Componentes Principales:

#### INTERFAZ DE USUARIO (MainActivity.kt):
```kotlin
@Composable
fun PantallaGenerador() {
    // Implementación de la interfaz principal usando Jetpack Compose
    // Incluye la visualización de la contraseña y botones de acción
}
```

#### GENERADOR DE CONTRASEÑAS (GeneradorContrasena.kt):
```kotlin
object GeneradorContrasena {
    // Implementación de la lógica de generación de contraseñas seguras
    // Utiliza kotlin.random para garantizar aleatoriedad
}
```

## 4. FLUJO DE LA APLICACIÓN

### 4.1 Inicio:
- Carga de la interfaz principal
- Generación automática de la primera contraseña
- Inicialización de componentes UI

### 4.2 Interacción del Usuario:
- Visualización de la contraseña generada
- Generación de nueva contraseña con un toque
- Copiado al portapapeles con un toque

### 4.3 Proceso de Generación:
- Algoritmo de generación segura
- Actualización instantánea de la interfaz
- Retroalimentación visual de acciones

## 5. NOTAS TÉCNICAS

### 5.1 Tecnologías Utilizadas:
- Kotlin como lenguaje principal
- Jetpack Compose para la UI
- Material Design 3
- Arquitectura moderna de Android

### 5.2 Requisitos:
- Android Studio
- Versión mínima de Android: 7.0 (API 24)
- No requiere permisos especiales
- No requiere conexión a internet

## CONCLUSIÓN

El desarrollo de YouPassW ha sido una experiencia enriquecedora que me ha permitido aplicar conceptos modernos de desarrollo Android. La implementación de Jetpack Compose ha demostrado ser una excelente elección para crear interfaces de usuario modernas y responsivas.

Este proyecto me ha permitido profundizar en:
- Desarrollo de UI declarativa con Jetpack Compose
- Implementación de arquitecturas limpias y mantenibles
- Manejo de estado en aplicaciones Android modernas
- Prácticas de UX/UI para aplicaciones móviles

La simplicidad y eficacia de la aplicación demuestra que un buen diseño no necesita ser complejo para ser efectivo. YouPassW cumple su propósito de manera elegante y eficiente, proporcionando una herramienta útil para la generación de contraseñas seguras.

Elaborado por: Sebastian Velasquez 