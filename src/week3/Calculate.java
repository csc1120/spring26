/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week3;

public final class Calculate {
    private Calculate() {
        throw new UnsupportedOperationException("Cannot instantiate "
                + Calculate.class.getSimpleName());
    }

    public static int calculate(int a, int b) {
        return a + b;
    }
}