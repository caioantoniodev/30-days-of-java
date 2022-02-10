package com.thirtydaysofthejava.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operators {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double mealCost = Double.parseDouble(bufferedReader.readLine().trim());

        int tipPercent = Integer.parseInt(bufferedReader.readLine().trim());

        int taxPercent = Integer.parseInt(bufferedReader.readLine().trim());

        CalcMealCost.solve(mealCost, tipPercent, taxPercent);

        bufferedReader.close();
    }
}
