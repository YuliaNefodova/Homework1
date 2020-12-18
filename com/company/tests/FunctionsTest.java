package com.company.tests;

import com.company.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FunctionsTest {

    Functions functions = new Functions();

    @Test
    public void testOne_task0(){

        String actual = functions.one_task(13);
        String expected = "thirteen";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testOne_task1(){

        String actual = functions.one_task(145);
        String expected = "one hundred forty five";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testOne_task2(){

        String actual = functions.one_task(0);
        String expected = "zero";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testOne_task3(){

        String actual = functions.one_task(100);
        String expected = "one hundred";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testOne_task4(){

        String actual = functions.one_task(1000);
        String expected = "one thousand";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testOne_task5(){

        String actual = functions.one_task(-5);
        String expected = "Please input a number between 0 and 1000";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testOne_task6(){

        String actual = functions.one_task(1024);
        String expected = "Please input a number between 0 and 1000";

        Assertions.assertEquals(expected,actual);

    }


}
