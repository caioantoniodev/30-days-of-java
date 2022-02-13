package com.thirtydaysofthejava.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        solve(n);

        bufferedReader.close();
    }

    private static void solve(int n) {
        for (int i = 1; i <= 10; i ++)
            System.out.printf("%d x %d = %d %n", n, i, (n * i));
    }
}
