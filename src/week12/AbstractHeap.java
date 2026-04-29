/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week12;

import java.util.ArrayList;
import java.util.Objects;

/**
 * A Heap implementation that defers priority definition to the subclass
 * @param <E> the element type stored in the heap
 */
public class AbstractHeap<E extends Comparable<E>> implements Heap<E> {
    private final ArrayList<E> heap;

    public AbstractHeap() {
        heap = new ArrayList<>();
    }

    @Override
    public boolean offer(E e) {
        // not null
        Objects.requireNonNull(e, "Parameter cannot be null");
        // no duplicates
        if(heap.contains(e)) {
            return false; // duplicate
        }
        // add at end
        heap.add(e);
        // compare to parent
        int child = heap.size() - 1;
        // left child = parent * 2 + 1
        // parent = (child - 1) / 2
        int parent = (child - 1) / 2;
        // until its less that its parent or it is the root
        // does parent exist?
        while(child > 0 && heap.get(child).compareTo(heap.get(parent)) > 0) {
            // swap
            swap(child, parent);
            // update index
            child = parent;
            parent = (child - 1) / 2;
        }
        return true;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void swap(int child, int parent) {

    }
}
