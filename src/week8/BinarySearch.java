/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week8;

/**
 * Binary Search Implementations using a sorted array
 */
public class BinarySearch {
    static void main() {
        final Integer[] arr = {1, 4, 7, 9, 11, 14, 17, 21, 25};
        final int[] testValues = {14, 15};
        System.out.println(binarySearch(arr, testValues[0]));
        System.out.println(binarySearch(arr, testValues[1]));
    }
    @SuppressWarnings({"rawtypes", "unchecked"})
    private static int binarySearch(Comparable[] arr, Comparable target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            // three possibilities
            // found it
            if(target.compareTo(arr[middle]) == 0) {
                return middle;
            } else if(target.compareTo(arr[middle]) < 0) {
                // compareTo -> target - arr[middle]
                // target is less than middle
                end = middle - 1;
            } else {
                // target is greater than middle
                start = middle + 1;
            }
        }
        return -1;
    }

    private static int binarySearch(Comparable[] arr, int target, int start, int end) {
        // base case
        if(start > end) {
            return -1;
        }
        int middle = (start + end) / 2;
        if(arr[middle].compareTo(target) == 0) {
            return middle;
        }
        // target is less than middle
        if(arr[middle].compareTo(target) < 0) {
            return binarySearch(arr, target, start, middle - 1);
        } else {
            return binarySearch(arr, target, middle + 1, end);
        }
    }
}
