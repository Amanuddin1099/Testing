package com.test;

import com.test.CalculateMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Calculate Method Class Test")
public class CalculatesMethodsTest {
    private CalculateMethods cal;

    @BeforeEach
    public void initTest() {
        cal = new CalculateMethods();
    }

    @Test
    @DisplayName("Divide Test")
    public void testDivide() {

        assertEquals(10, cal.divide(100, 10));
    }

    @Test
    @DisplayName("Subtraction Test")
    public void testSubtraction() {

        assertEquals(500, cal.Subtraction(800, 300));
    }

    @Test
    @DisplayName("Addition test")
    public void testAddition() {

        assertEquals(500, cal.addition(200, 300));
    }

    @Test
    @DisplayName("Multiply Test")
    public void testMultiply() {

        assertEquals(500, cal.multiply(100, 5));
    }


    }
