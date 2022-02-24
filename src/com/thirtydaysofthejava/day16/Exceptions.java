package com.thirtydaysofthejava.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exceptions {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();


        try {
            int N = Integer.parseInt(S);
            System.out.println(N);
        } catch(Exception e) {
            System.out.println("Bad String");
        }

        bufferedReader.close();
    }
}
