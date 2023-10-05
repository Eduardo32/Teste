package com.pauloeduardocosta.calculos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @Test
    void sumar() {
        Integer resultado = calculadora.sumar(6, 2);
        Assertions.assertEquals(8, resultado);
    }

    @Test
    void subtrair() {
        Integer resultado = calculadora.subtrair(6, 2);
        Assertions.assertEquals(4, resultado);
    }

    @Test
    void multiplicar() {
        Integer resultado = calculadora.multiplicar(6, 2);
        Assertions.assertEquals(12, resultado);
    }

    @Test
    void dividir() {
        Integer resultado = calculadora.dividir(6, 2);
        Assertions.assertEquals(3, resultado);
    }
}