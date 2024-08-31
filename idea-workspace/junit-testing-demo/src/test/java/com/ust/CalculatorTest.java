package com.ust;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class CalculatorTest {

    private static final org.slf4j.Logger log
            = org.slf4j.LoggerFactory.getLogger(CalculatorTest.class);

    private Calculator calc;

    @BeforeAll
    static void init() {
        log.info("Test Begin..");
    }

    @BeforeEach
    void setup() {
        calc = new Calculator();
        log.info("Calculator object created..");
    }

    @AfterEach
    void tearDown() {
        calc = null;
        log.info("Calculator object destroyed..");
    }

    @AfterAll
    static void complete() {
        log.info("Test Ends..");
    }


    @Test
    @EnabledOnJre(JRE.JAVA_21)
    @EnabledOnOs(OS.MAC)
    void addTest() {
        Assertions.assertEquals(50, calc.add(10, 40));
        Assertions.assertEquals(-10, calc.add(10, -20));
        Assertions.assertEquals(0, calc.add(10, -10));

    }


    @Nested
    class DivideTests {

        @Test
        void divideTest() {

            Assertions.assertEquals(5, calc.divide(10, 2));
            Assertions.assertEquals(-10, calc.divide(100, -10));
            Assertions.assertEquals(0, calc.divide(0, 10));

        }

        @Test
        void divideTestForException() {
            Assertions.assertThrows(Exception.class, () -> calc.divide(10, 0));
        }
    }


}
