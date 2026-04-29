package com.dam;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.dam.calculatorGAJ.Calculator;
import com.dam.calculatorGAJ.CalculatorGAJApplication;

@SpringBootTest(classes = CalculatorGAJApplication.class) // Le indicamos a Spring Boot dónde está la app principal
class CalculatorGAJApplicationTests {

    @Autowired // 3. Esto "conecta" el test con tu clase Calculator
    private Calculator calculator;

    @Test
    void contextLoads() {
    }

    @Test
    void testSum() {
        assertEquals(5, calculator.sum(3, 2));
    }
}