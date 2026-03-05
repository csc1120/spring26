/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week7;

public interface PureQueue<E> {
    E offer(E e);
    E poll();
    E peek();
    boolean isEmpty();
}
