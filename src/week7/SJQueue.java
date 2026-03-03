/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week7;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class SJQueue<E> implements Queue<E> {
    private LinkedList<E> data;

    public SJQueue() {
        data = new LinkedList<>();
    }

    @Override
    public boolean add(E e) {
        return data.add(e);
    }

    @Override
    public boolean offer(E e) {
        return data.offer(e);
    }

    @Override
    public E remove() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        return data.removeFirst();
    }

    @Override
    public E poll() {
        if(isEmpty()) {
            return null;
        }
        return data.poll();
    }

    @Override
    public E element() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        return data.element();
    }

    @Override
    public E peek() {
        if(isEmpty()) {
            return null;
        }
        return data.peek();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }




    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }
}
