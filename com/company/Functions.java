package com.company;

import java.util.Scanner;

public class Functions {

    public String one_task(int number){

        String[] twenty = {"zero","one","two","three","four","five","six",
                "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"one hundred","zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty",
                "seventy", "eighty", "ninety"};
        String [] hundreds =  {"one thousand", "one hundred", "two hundred", "three hundred", "four hundred",
                "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred" };

        while (true) {
            if ( number < 0 || number > 1000 ) {
                String text = "Please input a number between 0 and 1000";
                return text;
            }
            if ( number < 20 ) {
                return twenty[number];
            }

            if (number > 20 && number < 100 ) {
                int high = number / 10;
                int low = number % 10;
                String text = tens[high];
                if ( low != 0 )
                    text = text + " " + twenty[low];
                return text;
            }
            if (number > 100 && number < 1000) {
                int high = number / 100;
                int low = number % 10;
                String text = hundreds[high];
                if ( low != 0 )
                    text = text + " " + tens[low] + " " + twenty[low] ;
                return text;
            }
            else if (number == 100) {
                return tens[0];
            }
            else if (number == 1000) {
                return hundreds[0];
            }
        }
    }
}
