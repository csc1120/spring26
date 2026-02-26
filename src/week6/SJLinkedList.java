/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SJLinkedList<E> implements List<E> {
    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head;
    private int size;

    public SJLinkedList() {
        this.head = null;
        this.size = 0;
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
        Node<E> current = this.head;
        for(int i = 0; i < this.size; ++i) {
            if (current != null) {
                if(current.data.equals(o)) {
                    return true;
                }
                current = current.next;
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
    public boolean add(E e) { // O(n)
        Node<E> current = this.head;
        // get to the last node
        while(current.next != null) {
            current = current.next;
        }
        // add new node
        Node<E> newNode = new Node<>(e, null);
        current.next = newNode;
        ++this.size;
        return true;
    }

    @Override
    public boolean remove(Object o) { // O(n)
        // if remove index 0 (the head), it is O(1)
        if(this.head.data.equals(o)) {
            this.head = this.head.next;
        }
        Node<E> current = this.head;
        for(int i = 0; i < this.size; ++i) {
            if(current.next != null && current.next.data.equals(o)) {
                // found it. remove it
                current.next = current.next.next;
                this.size--;
                return true;
            }
        }
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
        this.head = null;
        this.size = 0;
    }

    @Override
    public E get(int index) {
        validateIndex(index);
        return null;
    }

    @Override
    public E set(int index, E element) {
        validateIndex(index);
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        validateIndex(index);
        return null;
    }

    private void validateIndex(int index) {
        if(index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index is out of bounds!");
        }
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
