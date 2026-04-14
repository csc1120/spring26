/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week12;

/**
 * Insertion Sort Implementation
 */
public class InsertionSort implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> void sort(T[] table) {
        for(int i = 1; i < table.length; ++i) {
            T current = table[i];
            int location = i;
            while(location > 0 && current.compareTo(table[location - 1]) < 0) {
                table[location] = table[location - 1];
                --location;
            }
            table[location] = current;
        }
    }
}
