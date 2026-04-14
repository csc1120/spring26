/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week12;

public class SelectionSort implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> void sort(T[] table) {
        for(int i = 0; i < table.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < table.length; j++) {
                if(table[j].compareTo(table[min]) < 0) {
                    min = j;
                }
            }
            swap(table, i, min);
        }
    }

    private <T extends Comparable<T>> void swap(T[] table, int i, int min) {
        T oldI = table[i];
        table[i] = table[min];
        table[min] = oldI;
    }
}
