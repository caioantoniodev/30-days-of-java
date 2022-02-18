package com.thirtydaysofthejava.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Binary {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        maximumNumberConsecutive(n);
    }

    private static void maximumNumberConsecutive(int n) {
        int maxConsecutive = 0;
        int consecutive = 0;

        for (int i = n; i > 0; i /= 2) {
            if (i % 2 == 0) {
                consecutive = Math.max(consecutive, maxConsecutive);
                maxConsecutive = 0;
            } else {
                maxConsecutive++;
            }
        }

        consecutive = Math.max(consecutive, maxConsecutive);

        System.out.println(consecutive);
    }
}
