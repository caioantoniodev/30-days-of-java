package com.thirtydaysofthejava.day2;

class Result {
    public static void solve(double mealCost, int tipPercent, int taxPercent) {
        double tip = (tipPercent / 100.0) * mealCost;
        double tax = (taxPercent / 100.0) * mealCost;

        double totalCost = mealCost + tip + tax;

        System.out.println(Math.round(totalCost));
    }
}
