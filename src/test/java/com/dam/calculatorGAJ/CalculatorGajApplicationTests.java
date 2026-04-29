package com.dam.calculatorGAJ;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired; // Importación necesaria
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest // Se mantiene la anotación
class CalculatorGAJApplicationTests { // Se cambia el nombre de la clase para que coincida con el nombre del archivo

    @Autowired // Esto permite que Spring cargue la clase Calculator automáticamente
    private Calculator calculator;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(3, 2));
    }
}