package week7;

public interface PureStack<E> {
    /**
     * Returns the value at the top of the stack
     * @return the top of the stack
     */
    E peek();

    /**
     * Removes and returns the top of the stack
     * @return the top of the stack
     */
    E pop();

    /**
     * Adding a new element to the top of the stack
     * @param e the new element
     * @return the new element
     */
    E push(E e);

    /**
     * Returns whether the stack is empty
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();
}
