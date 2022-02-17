package com.thirtydaysofthejava.day9;

import java.io.*;

public class Factorial {
    public static void main(String[] args) throws IOException {
        int result = Result.factorial(3);
        System.out.println(result);
    }
}

class Result {

    public static int factorial(int n) {
        if (n == 1)
            return 1;

        return n * factorial(n - 1);
    }
}
