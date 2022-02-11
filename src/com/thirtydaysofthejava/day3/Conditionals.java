package com.thirtydaysofthejava.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conditionals {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if (isOdd(N))
            System.out.println("Weird");
        else if (greaterThanTwoAndLessThanFive(N))
            System.out.println("Not Weird");
        else if (greaterThanSixAndLessThanTwenty(N))
            System.out.println("Weird");
        else
            System.out.println("Not Weird");

        bufferedReader.close();
    }

    public static boolean isOdd(Integer n) {
        return n % 2 == 1;
    }

    public static boolean greaterThanTwoAndLessThanFive(Integer n)     {
        return n >= 2 && n <= 5;
    }

    public static boolean greaterThanSixAndLessThanTwenty(Integer n)     {
        return n >= 6 && n <= 20;
    }
}
