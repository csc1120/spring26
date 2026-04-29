/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week14;

import week9.BinaryTree;

public class AVLTree<E extends Comparable<E>> extends BinarySearchTreeWithRotate<E> {
    private static class AVLNode<E extends Comparable<E>> extends BinaryTree.Node{
        private static final int BALANCED = 0;
        private static final int LEFT_BALANCE = -1;
        private static final int RIGHT_BALANCE = 1;

        private int balance;
        private AVLNode(E data) {
            super(data);
            this.balance = BALANCED;
        }

        @Override
        public String toString() {
            return "Balance: " + balance + super.toString();
        }
    }

    @Override
    public boolean add(E e) {
        // if empty, make new root
        if(this.root == null) {
            this.root = new AVLNode<E>(e);
            return true;
        } else {
            // otherwise add to the root
            this.root = add(e, (AVLNode<E>) this.root);
        }
        return addReturn;
    }

    private AVLNode<E> add(E e, AVLNode<E> node) {
        // base case
        if(node == null) {
            // found where to put
            addReturn = true;
        }
        if(node.data.equals(e)) {
            // already exists
            addReturn = false;
        }
        // if e < node.data go left
        // call add(left)
        // node = return of add()
        // calculate node balance by looking at child balanced
        // if balance == -2 - rebalance
        //    if L-R imbalance -> make it L-L by rotating left child left
        //    if L-L imbalance -> rotate right around parent
        // else go right
        // call add(right)
        // node = return of add()
        // calculate node balance by looking at child balanced
        // if balance == 2 - rebalance
        //    if R-L imbalance -> make it R-R by rotating right child right
        //    if R-R imbalance -> rotate left around parent
        return null;
    }
}
