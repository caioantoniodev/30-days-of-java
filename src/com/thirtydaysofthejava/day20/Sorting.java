package com.thirtydaysofthejava.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int numSwaps = bubbleSort(n, a);

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n - 1));

        bufferedReader.close();
    }

    private static int bubbleSort(int n, List<Integer> a) {
        int numSwaps = 0;
        for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                if (a.get(j) > a.get(j + 1)) {

                    int temp = a.get(j + 1);
                    a.set(j + 1, a.get(j));
                    a.set(j, temp);

                    numberOfSwaps++;
                    numSwaps++;
                }
            }

            if (numberOfSwaps == 0) {
                break;
            }
        }
        return numSwaps;
    }
}
