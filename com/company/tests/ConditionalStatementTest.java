package com.company.tests;

import com.company.ConditionalStatement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionalStatementTest {

    ConditionalStatement conditionalStatement = new ConditionalStatement();

    @Test
    public  void testParityCheck1(){

        int actual = conditionalStatement.parityCheck(3,2);
        int expected = 5;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testParityCheck2(){

        int actual = conditionalStatement.parityCheck(0,3);
        int expected = 0;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testParityCheck3(){

        int actual = conditionalStatement.parityCheck(-3,0);
        int expected = -3;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testDefineQuarter1(){

        String actual = conditionalStatement.defineQuarter (1,1);
        String expected = "Quarter 1.";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testDefineQuarter2(){

        String actual = conditionalStatement.defineQuarter (-1,1);
        String expected = "Quarter 2.";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testDefineQuarter3(){

        String actual = conditionalStatement.defineQuarter (-1,-1);
        String expected = "Quarter 3.";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testDefineQuarter4(){

        String actual = conditionalStatement.defineQuarter (1,-1);
        String expected = "Quarter 4.";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testDefineQuarter5(){

        String actual = conditionalStatement.defineQuarter (0,1);
        String expected = "Point on the 'Y' between 1 and 2 quarters.";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testDefineQuarter6(){

        String actual = conditionalStatement.defineQuarter (-1,0);
        String expected = "Point on the 'X' between 2 and 3 quarters.";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public  void testDefineQuarter7(){

        String actual = conditionalStatement.defineQuarter (0,0);
        String expected = "Point at the origin.";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testSumPositiveNumbers1(){

        int array[] = {1, -1, 2, 3, -6};
        int actual = conditionalStatement.sumPositiveNumbers(array);
        int expected = 6;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSumPositiveNumbers2() {

        int array[] = {0, -8, -1, -6};
        int actual = conditionalStatement.sumPositiveNumbers(array);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConsidersExpression1(){

        int actual = conditionalStatement.considersExpression(1,2,6);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConsidersExpression2(){

        int actual = conditionalStatement.considersExpression(0,3,1);
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRatingScore1(){

        String actual = conditionalStatement.ratingScore(80);
        String expected = "Grade B";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRatingScore2(){

        String actual = conditionalStatement.ratingScore(156);
        String expected = "Rating can be from 0 to 100 ";

        Assertions.assertEquals(expected, actual);
    }
}
