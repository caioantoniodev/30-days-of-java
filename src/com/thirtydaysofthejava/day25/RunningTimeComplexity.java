package com.thirtydaysofthejava.day25;

import java.util.Scanner;

public class RunningTimeComplexity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            prime(n);
        }
    }

    static void prime(int n) {
        boolean flag = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (n == 1)
            System.out.println("Not prime");
        else if (!flag)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }
}
