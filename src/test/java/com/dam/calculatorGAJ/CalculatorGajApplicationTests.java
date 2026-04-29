package com.dam.calculatorGAJ;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired; // Importación necesaria
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorGajApplicationTests {

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