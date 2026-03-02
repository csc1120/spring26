/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week7;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDriver {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        for(int i = 0; i < linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }
        for(String s : linkedList) {
            System.out.println(s);
        }
    }
}
