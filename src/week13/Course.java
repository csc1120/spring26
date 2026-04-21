/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week13;

/**
 * A Course with a name
 */
public class Course implements Cloneable {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Course clone() throws CloneNotSupportedException {
        return (Course) super.clone();
    }
}
