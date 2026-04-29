/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week14;

import week9.BinarySearchTree;

public class BinarySearchTreeWithRotate<E extends Comparable<E>> extends BinarySearchTree<E> {
    public Node<E> rotateLeft(Node<E> localRoot) {
        // Rotate Left algorithm
        // 1. temp = root.right
        // 2. root.right = temp.left
        // 3. temp.left = root
        // 4. root = temp
        Node<E> temp = localRoot.right;
        localRoot.right = temp.left;
        temp.left = localRoot;
        return temp;
    }

    public Node<E> rotateRight(Node<E> localRoot) {
        // Rotate Right algorithm
        // 1. temp = root.left
        // 2. root.left = temp.right
        // 3. temp.right = root
        // 4. root = temp
        Node<E> temp = localRoot.left;
        localRoot.left = temp.right;
        temp.right = localRoot;
        return temp;
    }
}
