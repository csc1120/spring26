/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week9;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> {
    private boolean addReturn;

    public BinarySearchTree() {
        super();
    }

    public boolean add(E data) {
        addReturn = false;
        this.root = add(root, data);
        return addReturn;
    }

    private Node<E> add(Node<E> node, E data) {
        if(node == null) {
            addReturn = true;
            return new Node<>(data);
        }
        int compared = node.data.compareTo(data);
        if(compared < 0) {
            node.left = add(node.left, data);
        } else if(compared > 0) {
            node.right = add(node.right, data);
        }
        return node;
    }
}
