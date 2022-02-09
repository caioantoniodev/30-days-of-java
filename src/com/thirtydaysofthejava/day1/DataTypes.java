package com.thirtydaysofthejava.day1;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int inInt = scan.nextInt();
        double inDouble = scan.nextDouble();

        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String inString = scan.nextLine();

        System.out.println(i + inInt);
        System.out.println(d + inDouble);

        String concat = s.concat(inString);
        System.out.println(concat);

        scan.close();
    }
}
