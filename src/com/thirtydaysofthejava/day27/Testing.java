package com.thirtydaysofthejava.day27;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Testing {
    private static final Integer ZERO = 0;

    public static void testWithEmptyArray() {
        try {
            int[] seq = testDataEmptyArray.getArray();
            int result = minimumIndex(seq);
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    public static void testWithUniqueValues() {
        int[] seq = testDataUniqueValues.getArray();

        if (seq.length < 2) throw new AssertionError("less than 2 elements in the array");

        Integer[] tmp = new Integer[seq.length];

        for (int i = 0; i < seq.length; ++i) tmp[i] = Integer.valueOf(seq[i]);

        if (!(new LinkedHashSet<Integer>(Arrays.asList(tmp)).size() == seq.length))
            throw new AssertionError("not all values are unique");

        int expectedResult = testDataUniqueValues.getExpectedResult();

        int result = minimumIndex(seq);

        if (result != expectedResult) throw new AssertionError("result is different than the expected result");
    }

    public static void testWithExactlyTwoDifferentMinimums() {
        int[] seq = testDataExactlyTwoDifferentMinimums.getArray();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        int[] tmp = seq.clone();
        Arrays.sort(tmp);
        if (!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2]))) {
            throw new AssertionError("there are not exactly two minimums in the array");
        }

        int expectedResult = testDataExactlyTwoDifferentMinimums.getExpectedResult();
        int result = minimumIndex(seq);
        if (result != expectedResult) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void main(String[] args) {
        testWithEmptyArray();
        testWithUniqueValues();
        testWithExactlyTwoDifferentMinimums();
        System.out.println("OK");
    }

    private static int minimumIndex(int[] seq) {

        if (seq.length == 0)
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");

        int minIdx = 0;

        for (int i = 1; i < seq.length; ++i) {

            if (seq[i] < seq[minIdx]) minIdx = i;
        }
        return minIdx;
    }

    private static class testDataExactlyTwoDifferentMinimums {

        public static int[] getArray() {

            return new int[]{1, 3, 1};
        }

        public static int getExpectedResult() {

            return ZERO;
        }
    }

    private static class testDataUniqueValues {

        public static int[] getArray() {

            return new int[]{1, 2, 3, 4, 5};
        }

        public static int getExpectedResult() {

            return ZERO;
        }
    }

    private static class testDataEmptyArray {

        public static int[] getArray() {
            return new int[]{};
        }
    }
}
