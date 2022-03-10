package com.thirtydaysofthejava.day29;

import java.io.*;
import java.util.stream.IntStream;

public class BitwiseAND {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int count = Integer.parseInt(firstMultipleInput[0]);

                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = Result.bitwiseAnd(count, lim);

                bufferedWriter.write(String.valueOf(res));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {

    private Result() {
    }

    public static int bitwiseAnd(int N, int K) {
        int result = 0;
        for (int A = 1; A <= K; A++) {
            for (int B = A + 1; B <= N; B++) {
                int current = A & B;
                if (current > result && current < K) {
                    result = current;
                }
            }
        }
        return result;
    }
}
