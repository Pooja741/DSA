package com.ps.algo.searching;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {

        int leftPtr = 0;
        int rightPtr = array.length - 1;
        while (leftPtr <= rightPtr) {
            int midPtr = leftPtr + (rightPtr - leftPtr) / 2;
            if (array[midPtr] == target)
                return midPtr;
            else if (array[midPtr] < target)
                leftPtr = midPtr + 1;
            else
                rightPtr = midPtr - 1;
        }

        return -1;
    }
}
