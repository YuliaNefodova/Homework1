package com.company.tests;

import com.company.OneDimensionalArrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OneDimensionalArraysTest {

    OneDimensionalArrays oneDimensionalArrays = new OneDimensionalArrays();

    @Test
    public void testGetMinElementArray1(){

        int [] array = {8,9,1,3,4};
        int actual = oneDimensionalArrays.getMinElementArray(array);
        int expected =1;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testGetMinElementArray2(){

        int [] array = {8,9,1,-3,-4};
        int actual = oneDimensionalArrays.getMinElementArray(array);
        int expected =-4;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testGetMaxElementArray(){

        int [] array = {8,9,1,-3,-4};
        int actual = oneDimensionalArrays.getMaxElementArray(array);
        int expected = 9;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testGetMinIndexArray1(){

        int [] array = {8,9,1,-3,-4};
        int actual = oneDimensionalArrays.getMinIndexArray(array);
        int expected = 4;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testGetMinIndexArray2(){

        int [] array = {6,3,0,7,8};
        int actual = oneDimensionalArrays.getMinIndexArray(array);
        int expected = 2;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testGetMaxIndexArray1(){

        int [] array = {6,3,0,7,8};
        int actual = oneDimensionalArrays.getMaxIndexArray(array);
        int expected = 4;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testGetMaxIndexArray2(){

        int [] array = {8,9,1,-3,-4};
        int actual = oneDimensionalArrays.getMaxIndexArray(array);
        int expected = 1;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testGetSumUnevenIndexArray1(){

        int [] array = {1,2,3,4,5};
        int actual = oneDimensionalArrays.getSumUnevenIndexArray(array);
        int expected = 6;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testGetSumUnevenIndexArray2(){

        int [] array = {1,-2,3,4,-5};
        int actual = oneDimensionalArrays.getSumUnevenIndexArray(array);
        int expected = 2;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testGetReverse1() {

        int[] array = {1, 2, 3, 4, 5};
        String actual = oneDimensionalArrays.getReverse(array);
        String expected = "[5, 4, 3, 2, 1]";

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testGetReverse2() {

        int[] array = {4, 6, 7, 9, 0};
        String actual = oneDimensionalArrays.getReverse(array);
        String expected = "[0, 9, 7, 6, 4]";

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testGetNumOddElements(){

        int[] array = {4, 6, 7, 9, 0};
        int actual = oneDimensionalArrays.getNumOddElements(array);
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testGetReverseTwoParts1(){
        int[] array = {1, 2, 3, 4, 5, 6};
        String actual = oneDimensionalArrays.getReverseTwoParts(array);
        String expected = "[4, 5, 6, 1, 2, 3]";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetReverseTwoParts2(){
        int[] array = {0, 5, 6, 9, 2, 3};
        String actual = oneDimensionalArrays.getReverseTwoParts(array);
        String expected = "[9, 2, 3, 0, 5, 6]";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetSortArray1(){

        int[] array = {0, 5, 6, 9, 2, 3};
        String actual = oneDimensionalArrays.getSortArray(array);
        String expected = "[0, 2, 3, 5, 6, 9]";

        Assertions.assertEquals(expected, actual);
    }



}
