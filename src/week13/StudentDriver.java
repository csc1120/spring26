/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week13;

import java.util.ArrayList;

/**
 * Beware, Student Driver
 */
public class StudentDriver {
    static void main() {
        Student a = new Student();
        a.setName("Abbie");
        a.setCourses(new ArrayList<>());
        a.addCourse(new Course("CSC1120"));
        System.out.println(a);

        Student b = new Student();
        b.setName(a.getName());
        b.setCourses(new ArrayList<>());
        b.addCourse(new Course("MTH1110"));
        System.out.println(a);
    }
}
