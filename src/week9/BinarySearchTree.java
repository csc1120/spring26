/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week9;

/**
 * A Binary Search tree implementation using the Binary Tree class
 * @param <E> the element type stored in the Tree
 */
public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> {
    protected boolean addReturn;
    private E deleteReturn;

    /**
     * No-param constructor
     */
    public BinarySearchTree() {
        super();
    }

    /**
     * Adds the value to the tree based on
     * @param data
     * @return
     */
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

    public boolean contains(E data) {
        return contains(root, data);
    }

    private boolean contains(Node<E> node, E data) {
        //base
        if(node == null) {
            return false;
        }
        int compared = node.data.compareTo(data);
        if(compared == 0) {
            return true;
        }
        //recursive
        if(compared < 0) {
            return contains(node.left, data);
        } else {
            return contains(node.right, data);
        }
    }

    public E find(E data) {
        return find(root, data);
    }

    private E find(Node<E> node, E data) {
        //base
        if(node == null) {
            return null;
        }
        int compared = node.data.compareTo(data);
        if(compared == 0) {
            return node.data;
        }
        //recursive
        if(compared < 0) {
            return find(node.left, data);
        } else {
            return find(node.right, data);
        }
    }

    public E delete(E data) {
        this.root = delete(this.root, data);
        return deleteReturn;
    }

    private Node<E> delete(Node<E> node, E target) {
        // null
        if(node == null) {
            deleteReturn = null;
            return node;
        }
        // found it
        int compared = target.compareTo(node.data);
        if(compared == 0) {
            deleteReturn = node.data;
            // removing

            // is leaf
            // set it to null

            // one child
            // replace it with the child

            // two children
            // find largest child of the left subtree - helper method
            // then remove than node


        }
        // data is less than
        if(compared < 0) {
            node.left = delete(node.left, target);
        } else {
            // data is greater than
            node.right = delete(node.right, target);
        }
       return node;
    }
}
