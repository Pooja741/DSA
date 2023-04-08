package com.ps.algo.searching;

public class ThreeLargestNumbersInArray {
    public static int[] findThreeLargestNumbers(int[] array) {
        int[] ans = new int[3];
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax)
                thirdMax = num;
        }

        ans[2] = max;
        ans[1] = secondMax;
        ans[0] = thirdMax;
        return ans;
    }
}
