/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week7;

import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 * A wrapper class that wraps around a LinkedList and
 * presents a Stack Interface
 * @param <E> the element type in the Stack
 */
public class SJStack<E> implements PureStack<E> {
    private LinkedList<E> data;

    /**
     * Stack constructor. This stack will always add and remove from
     * the front of the list (index 0)
     */
    public SJStack() {
        data = new LinkedList<>();
    }

    @Override
    public E peek() { // O(1)
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return data.peek();
    }

    @Override
    public E pop() {//  O(1)
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return data.pop();
    }

    @Override
    public E push(E e) { // O(1)
        data.push(e);
        return e;
    }

    @Override
    public boolean isEmpty() { // O(1)
        return data.isEmpty();
    }
}
