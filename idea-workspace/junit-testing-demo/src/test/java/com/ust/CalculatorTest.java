package com.ust;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void addTest(){
        Calculator calc = new Calculator();

        Assertions.assertEquals(50,calc.add(10,40));
        Assertions.assertEquals(-10,calc.add(10,-20));
        Assertions.assertEquals(0,calc.add(10,-10));

    }


    @Test
    void divideTest(){

        Calculator calc = new Calculator();

        Assertions.assertEquals(5,calc.divide(10,2));
        Assertions.assertEquals(-10,calc.divide(100,-10));
        Assertions.assertEquals(0,calc.divide(0,10));
        Assertions.assertThrows(Exception.class, ()-> calc.divide(10,0));

    }



}
