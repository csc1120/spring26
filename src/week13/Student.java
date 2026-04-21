/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week13;

import java.util.ArrayList;
import java.util.List;

/**
 * A Student with a name and a List of Courses
 */
public class Student implements Cloneable {
    private String name;
    private List<Course> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        return "name=" + name + ", courses=" + courses;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student copy = (Student) super.clone();
//        Student copy = new Student();
//        copy.name = this.name;
        copy.courses = new ArrayList<>();
        for(Course c : courses) {
            copy.courses.add(c.clone());
        }
        return copy;
    }
}