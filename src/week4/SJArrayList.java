/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * A simple ArrayList implementation
 * @param <E> The element type stored in the ArrayList. This will be erased
 *           and replaced with a concrete data type when the List is
 *           initialized with the Constructor.
 */
public class SJArrayList<E> implements List<E> {
    // default starting size
    private static final int DEFAULT_CAPACITY = 20;
    // E array
    private E[] data;
    // size variable
    private int size;

    public SJArrayList() {
        this.size = 0;
        this.data = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() { // O(1)
        return this.size;
    }

    @Override
    public boolean isEmpty() { // O(1)
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) { // O(n)
        for(int i = 0; i < this.size; ++i) {
            if(this.data[i].equals(o)) {
                // found it!
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) { // O(1)
        // check that it's not full
        // if it's full, we need a bigger array
        if(this.size == this.data.length) {
            // need to make bigger array
            reallocate();
            // amortize reallocate so we don't count it
        }
        this.data[this.size++] = e;
        return true;
    }

    private void reallocate() { // O(n)
        // make a bigger array
        E[] newData = (E[]) new Object[this.data.length * 2];
        // copy everything over
        for(int i = 0; i < this.data.length; ++i) {
            newData[i] = this.data[i];
        }
        // replace the old array
        this.data = newData;
    }

    @Override
    public boolean remove(Object o) { // O(n)
        // find if it's there
        for(int i = 0; i < this.size; ++i) {
            if(this.data[i].equals(o)) {
                // if its there, remove it
                // found it. remove it
                for(int j = i + 1; j < this.size; ++j) {
                    this.data[j - 1] =  this.data[j];
                }
                return true;
            }
        }
        // did not find it, did nothing
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) { // O(1)
        if(index < 0 || index >= this.size) {
            // bad user input
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
        return this.data[index];
    }

    @Override
    public E set(int index, E element) { // O(1)
        if(index < 0 || index >= this.size) {
            // bad user input
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
        E old = this.data[index];
        this.data[index] = element;
        return old;
    }

    @Override
    public void add(int index, E element) { // O(n)
        if(index < 0 || index >= this.size) {
            // bad user input
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
        // am I full?
        if(this.size == this.data.length) {
            reallocate();
        }
        // move everything to the right
        for(int i = this.size - 1; i >= index; --i) {
            this.data[i + 1] =  this.data[i];
        }
        this.data[index] = element;
    }

    @Override
    public E remove(int index) {
        if(index < 0 || index >= this.size) {
            // bad user input
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}
