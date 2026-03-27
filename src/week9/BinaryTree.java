/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week9;

import java.util.function.BiConsumer;

public class BinaryTree<E> {
    protected static class Node<E> {
        protected E data;
        protected Node<E> left;
        protected Node<E> right;

        protected Node(E data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    protected Node<E> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(E data, BinaryTree<E> left, BinaryTree<E> right) {
        this.root = new Node<>(data);
        if(left != null) {
            this.root.left = left.root;
        } else {
            this.root.left = null;
        }
        if(right != null) {
            this.root.right = right.root;
        } else {
            this.root.right = null;
        }
    }

    private BinaryTree(Node<E> root) {
        this.root = root;
    }

    public BinaryTree<E> getLeftSubTree() {
        if(this.root.left != null) {
            return new BinaryTree<>(this.root.left);
        }
        return null;
    }

    public BinaryTree<E> getRightSubTree() {
        if(this.root.right != null) {
            return new BinaryTree<>(this.root.right);
        }
        return null;
    }

    public E getData() {
        return this.root.data;
    }

    public boolean isLeaf() {
        return this.root.left == null && this.root.right == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(this.root, 1, sb);
        return sb.toString();
    }

    private void toString(Node<E> node, int depth, StringBuilder sb) {
        // base case
        if(node != null) {
            // recursive Inorder Traversal
            // L
            toString(node.left, depth + 1, sb);
            // V
            for(int i = 1; i < depth; ++i) {
                sb.append("  ");
            }
            sb.append(node.data.toString());

            // R
            toString(node.right, depth + 1, sb);
        }
    }

    public void preOrderTraversal(BiConsumer<E, Integer> consumer) {
        preOrderTraversal(consumer, 1, this.root);
    }

    private void preOrderTraversal(BiConsumer<E, Integer> consumer, int depth, Node<E> node) {
        if(node != null) {
            // V L R
            consumer.accept(node.data, depth);
            preOrderTraversal(consumer, depth + 1, node.left);
            preOrderTraversal(consumer, depth + 1, node.right);
        }
    }
}








