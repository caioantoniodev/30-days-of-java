package com.thirtydaysofthejava.day28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class RegExPatternsDatabases {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        String regex = ".+@gmail\\.com$";

        List<String> list = new ArrayList();

        Pattern pattern = Pattern.compile(regex);

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];

                Matcher matcher = pattern.matcher(emailID);

                if (matcher.find()) list.add(firstName);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Collections.sort(list);

        for (String names : list) {
            System.out.println(names);
        }

        bufferedReader.close();
    }
}
