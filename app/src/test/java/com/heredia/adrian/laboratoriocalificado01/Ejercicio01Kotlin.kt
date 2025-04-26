package com.heredia.adrian.laboratoriocalificado01

import org.junit.Test

class Ejercicio01Kotlin {

    // Función que encuentra el mayor de tres números
    fun encontrarMayor(num1: Int, num2: Int, num3: Int): Int {
        var mayor = num1 // Inicialmente asumimos que el primer número es el mayor

        if (num2 > mayor) {
            mayor = num2 // Si el segundo número es mayor, lo actualizamos
        }

        if (num3 > mayor) {
            mayor = num3 // Si el tercero es mayor, lo actualizamos
        }

        return mayor // Retornamos el mayor
    }

    // ---------------------- TESTS ----------------------

    @Test
    fun testMayorCaso1() {
        val resultado = encontrarMayor(5, 12, 3)
        println("Resultado esperado: 12, Resultado obtenido: $resultado")
        assert(resultado == 12)
    }

    @Test
    fun testMayorCaso2() {
        val resultado = encontrarMayor(9, 4, 9)
        println("Resultado esperado: 9, Resultado obtenido: $resultado")
        assert(resultado == 9)
    }

    @Test
    fun testMayorCaso3() {
        val resultado = encontrarMayor(20, 15, 60)
        println("Resultado esperado: 60, Resultado obtenido: $resultado")
        assert(resultado == 60)
    }
}
