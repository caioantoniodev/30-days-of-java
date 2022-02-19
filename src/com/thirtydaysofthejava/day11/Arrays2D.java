package com.thirtydaysofthejava.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Arrays2D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

        System.out.println(solve(arr));

        bufferedReader.close();
    }

    private static int solve(List<List<Integer>> arr){
        int max = Integer.MIN_VALUE;
        int total = 0;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                total += arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) +
                        arr.get(i + 1).get(j + 1)
                        +arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                max = Math.max(max, total);
                total = 0;
            }
        }
        return max;
    }
}
