package com.thirtydaysofthejava.day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook  = new HashMap<>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();

            phoneBook .put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            Integer phone = phoneBook.get(s);

            System.out.print((phone != null)
                    ? s + "=" + phone
                    : "Not found");
        }
        in.close();
    }
}