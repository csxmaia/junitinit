package com.company.tests;
import com.company.Calculadora;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraJUnit {

    Calculadora calculadora = new Calculadora();

    @Test
    public void SomaTest(){
        double n1 = 100;
        double n2 = 90;
        double esperado = 190;
        double response = calculadora.soma(n1, n2);
        assertEquals(esperado, response);
    }

    @Test
    public void SubtracaoTest(){
        double n1 = 100;
        double n2 = 90;
        double esperado = 10;
        double response = calculadora.subtracao(n1, n2);
        assertEquals(esperado, response);
    }

    @Test
    public void MultiplicacaoTest(){
        double n1 = 100;
        double n2 = 100;
        double esperado = 10000;
        double response = calculadora.multiplicacao(n1, n2);
        assertEquals(esperado, response);
    }

    @Test
    public void DivisaoTest(){
        double n1 = 100;
        double n2 = 20;
        double esperado = 5;
        double response = calculadora.divisao(n1, n2);
        assertEquals(esperado, response);
    }

}
