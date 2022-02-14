package com.thirtydaysofthejava.day6;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < cases; i++) {

            char[] array = scanner.nextLine().toCharArray();

            printTheEvenIndices(array);

            System.out.print(" ");

            printTheOddIndices(array);

            System.out.println();
        }

        scanner.close();
    }

    private static void printTheOddIndices(char[] array) {
        for (int i = 1; i < array.length; i+=2) {
            System.out.print(array[i]);
        }
    }

    private static void printTheEvenIndices(char[] array) {
        for (int i = 0; i < array.length; i+=2) {
           System.out.print(array[i]);
        }
    }
}
