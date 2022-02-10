## Objective
In this challenge, you will work with arithmetic operators. Check out the Tutorial tab for learning materials and an instructional video.

## Task
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. Round the result to the nearest integer.

## Example 
- meal_cost = 100
- tip_percent = 15
- tax_percent = 8

A tip of **15% * 100 = 15**, and the taxes are **8% * 100 = 8**. Print the value  and return from the function.


## Function Description
Complete the solve function in the editor below.

solve has the following parameters:

- int meal_cost: the cost of food before tip and tax
- int tip_percent: the tip percentage
- int tax_percent: the tax percentage
 
Returns The function returns nothing. Print the calculated value, rounded to the nearest integer.

**Note:** Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result.

## Input Format
There are **3** lines of numeric input:
The first line has a double, **meal_cost** (the cost of the meal before tax and tip).
The second line has an integer, **tip_percent** (the percentage of  being added as tip).
The third line has an integer, **tax_percent** (the percentage of  being added as tax).

## Output Format

Print the sum of both integers on the first line, the sum of both doubles (scaled to  decimal place) on the second line, and then the two concatenated strings on the third line.

## Sample Input

```
12.00
20
8
```

## Sample Output

```
15
```

## Explanation

When we sum the integers **4** and **12**, we get the integer **16**.
When we sum the floating-point numbers **4.0** and **4.0**, we get **8.0**.
When we concatenate **HackerRank** with **is the best place to learn and practice coding!**, we get **HackerRank is the best place to learn and practice coding!**.

You will not pass this challenge if you attempt to assign the Sample Case values to your variables instead of following the instructions above and reading input from stdin.