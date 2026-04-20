/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Big-O Revisited
 */
public class BigO {
    static void main() {
        int[] arr = {8, 6, 7, 5, 3, 0, 9};
        // O(1)
        // accessing array index
        // isEmpty()
        // Insert/remove HashMap
        //
        // O(n)
        // traverse through a list contains()
        // adding linked list
        // tree traversal
        //
        // O(log n)
        // searching a Balanced BST
        // binary search on a sorted list
        // inserting/removing from a heap
        //
        // O(n log n)
        // sorting -> divide and conquer
        //
        // O(n^2)
        // nested for loop where both are n-length
        //
        LinkedList<Integer> list = new LinkedList();
        System.out.println(arr[5]);
        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int i : arr) { // n
            treeSet.add(i); // log n
        }

        ArrayList<Integer> sortme = new ArrayList<>();
        for(int i : arr) { // O(n)
            int index = Collections.binarySearch(sortme, i); // O(log n)
            if(index < 0) {
                index *= -1 - 1;
            }
            sortme.add(index, i); // O(n)
        }
        // n * (log n + 1 + n) = (nlogn + n + n^2)
        // O(n^2 + n + nlogn) = O(n^2)

        // hashmap O(1)?

    }
}
