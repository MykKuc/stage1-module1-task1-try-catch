package com.epam.m1.exceptions;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {

    private static final List<String> WORDS =
            Arrays.asList(
                    "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                            .split(" "));

    public static void main(String[] args) {
        Iterator<String> words = WORDS.iterator();
        int sum = 0;
        String justWords = "";
        while (words.hasNext()) {

            try {
                String next = words.next();
                int number = Integer.parseInt(next);
                sum = sum + number;
            } catch (NumberFormatException e) {
                String theExceptionString = e.toString();
                justWords = justWords + " " + StringUtils.substringBetween(theExceptionString,"\"","\"");
            }


        }

        System.out.println("Sum is " + sum);
        System.out.println("Just words:" + justWords);
    }
}

