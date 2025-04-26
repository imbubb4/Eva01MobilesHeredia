package com.heredia.adrian.laboratoriocalificado01

import org.junit.Test
import org.junit.Assert.*

/**
 * Clase de prueba para verificar si una palabra es un palíndromo.
 * Un palíndromo es una palabra que se lee igual de izquierda a derecha que de derecha a izquierda.
 */
class Ejercicio02Kotlin {

    /**
     * Función que verifica si una cadena es un palíndromo.
     * @param texto La cadena a verificar
     * @return true si es un palíndromo, false en caso contrario
     */
    private fun esPalindromo(texto: String): Boolean {
        // Convertimos el texto a minúsculas para ignorar mayúsculas
        val textoLimpio = texto.lowercase()
            // Eliminamos los espacios en blanco
            .replace(" ", "")

        println("Texto a verificar: '$texto'")
        println("Texto limpio: '$textoLimpio'")

        // Convertimos la cadena a un arreglo de caracteres para facilitar la comparación
        val caracteres = textoLimpio.toCharArray()

        // Índice que comienza desde el inicio de la cadena
        var inicio = 0
        // Índice que comienza desde el final de la cadena
        var fin = caracteres.size - 1

        // Mientras no nos hayamos cruzado en la comparación
        while (inicio < fin) {
            println("Comparando '${caracteres[inicio]}' con '${caracteres[fin]}'")
            // Si los caracteres en posiciones simétricas no coinciden, no es un palíndromo
            if (caracteres[inicio] != caracteres[fin]) {
                println("¡NO es palíndromo! Los caracteres en posición $inicio y $fin no coinciden")
                return false
            }
            // Avanzamos hacia el centro desde ambos extremos
            inicio++
            fin--
        }

        // Si llegamos aquí, todos los caracteres coincidieron, es un palíndromo
        println("¡SÍ es palíndromo! Todos los caracteres coinciden")
        return true
    }

    /**
     * Prueba para verificar que la palabra "Racecar" es un palíndromo
     */
    @Test
    fun testPalindromoRacecar() {
        println("\n----- PRUEBA CON 'Racecar' -----")
        val resultado = esPalindromo("Racecar")
        println("Resultado final: ¿Es 'Racecar' un palíndromo? $resultado")
        // Verificamos que "Racecar" es un palíndromo (debe devolver true)
        assertTrue("La palabra 'Racecar' debería ser un palíndromo", resultado)
        println("Test completado: La palabra 'Racecar' ES un palíndromo")
    }

    /**
     * Prueba para verificar que la palabra "Kotlin" no es un palíndromo
     */
    @Test
    fun testPalindromoKotlin() {
        println("\n----- PRUEBA CON 'Kotlin' -----")
        val resultado = esPalindromo("Kotlin")
        println("Resultado final: ¿Es 'Kotlin' un palíndromo? $resultado")
        // Verificamos que "Kotlin" no es un palíndromo (debe devolver false)
        assertFalse("La palabra 'Kotlin' no debería ser un palíndromo", resultado)
        println("Test completado: La palabra 'Kotlin' NO es un palíndromo")
    }

    /**
     * Prueba para verificar que una frase con espacios que es palíndromo
     */
    @Test
    fun testPalindromoConEspacios() {
        println("\n----- PRUEBA CON 'Anita lava la tina' -----")
        val resultado = esPalindromo("Anita lava la tina")
        println("Resultado final: ¿Es 'Anita lava la tina' un palíndromo? $resultado")
        // Verificamos que "Anita lava la tina" es un palíndromo (debe devolver true)
        assertTrue("La frase 'Anita lava la tina' debería ser un palíndromo", resultado)
        println("Test completado: La frase 'Anita lava la tina' ES un palíndromo")
    }
}