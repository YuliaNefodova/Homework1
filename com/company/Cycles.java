package com.company;

import java.util.Arrays;

public class Cycles {

    public String getSumEvenNumbers(){ //quantity from 1 to 99

        String result = " ";

        int sum = 0;
        int counter = 0;
        for (int i = 1; i < 99; i += 2)
        {
            sum = sum + i;
            counter++;
        }
        result = "Sum of even numbers от 1 to 99 =:" + sum + '\n' +
                " Number of even numbers from 1 to 99 = " + counter;
        return result;

    }

    public String checkPrimeNumber(int num) {

        String result = " ";
        for ( int i=2; i < num; i++) {
            if ( num%i == 0) {
                result = "Number " + num + " is not simple.";
                return result;
            }
        }
        result = "Number " + num + " is simple.";
        return result;
    }

    public int getNaturalRoot(int num){

        int root = 1;
        while (root * root <= num) root++;
        --root;
        return root;
    }

    public int getFactorial(int num){

        int result = 1;
        for (int i = 1; i <=num; i ++){
            result = result*i;
        }
        return result;
    }

    public int getSumNumbers(int num){

        int sum = 0;

        while (num != 0) {
            sum = sum + (num % 10);
            num /= 10;
        }
       return sum;
    }

    public void getMirrorReflection(int num){
        
        while (num>0){
            System.out.print(num%10);
            num/=10;
        }

    }
}
