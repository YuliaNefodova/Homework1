package com.company.tests;

import com.company.Cycles;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CyclesTest {
    Cycles cycles = new Cycles();

    @Test
    public  void testGetSumEvenNumbers(){

        String actual = cycles.getSumEvenNumbers();
        String expected = "Sum of even numbers от 1 to 99 =:2401\n " +
                "Number of even numbers from 1 to 99 = 49";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testCheckPrimeNumber1(){

        String actual = cycles.checkPrimeNumber(11);
        String expected = "Number 11 is simple.";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testCheckPrimeNumber2(){

        String actual = cycles.checkPrimeNumber(12);
        String expected = "Number 12 is not simple.";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testGetNaturalRoot1(){

        int actual = cycles.getNaturalRoot(9);
        int expected = 3;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testGetNaturalRoot2(){

        int actual = cycles.getNaturalRoot(15);
        int expected = 3;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testGetFactorial1(){

        int actual = cycles.getFactorial(5);
        int expected = 120;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testGetFactorial2(){

        int actual = cycles.getFactorial(0);
        int expected = 1;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testGetSumNumbers1(){

        int actual = cycles.getSumNumbers(56);
        int expected = 11;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testGetSumNumbers2(){

        int actual = cycles.getSumNumbers(123);
        int expected = 6;

        Assertions.assertEquals(expected,actual);

    }

}
