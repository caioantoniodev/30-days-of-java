package com.thirtydaysofthejava.day19;

import java.util.Scanner;

public class Interfaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int divisors = 0;

        for (int i = 1; i <= n; i++) {
            if ( n % i == 0)
                divisors += i;
        }
        return divisors;
    }
}

interface AdvancedArithmetic{
    int divisorSum(int n);
}

