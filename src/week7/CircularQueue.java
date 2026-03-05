/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week7;

public class CircularQueue<E> implements PureQueue<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private final E[] data;
    private int front;
    private int rear;
    private int size;

    @SuppressWarnings("unchecked")
    public CircularQueue() {
        this.data = (E[]) new Object[DEFAULT_CAPACITY];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    @Override
    public E offer(E e) {
        // are we full?
        if(size == data.length) {
            return null;
        }
        this.data[rear] = e;
        rear = (rear + 1) % data.length;
        size++;
        return e;
    }

    @Override
    public E poll() {
        if(size == 0) {
            return null;
        }
        E result = data[front];
        front = (front + 1) % data.length;
        --size;
        return result;
    }

    @Override
    public E peek() {
        if(size == 0) {
            return null;
        }
        return data[front];
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }
}
