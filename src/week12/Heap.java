package week12;

public interface Heap<E extends Comparable<E>> {
    boolean offer(E e);
    E poll();
    int size();
    boolean isEmpty();
}
