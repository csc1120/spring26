/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week4.SJArrayList;

public class Testing {
    // 1. "Happy Path" - input gives correct output
    // 2. Boundary Conditions / edge cases
    SJArrayList<String> list;

    // @BeforeAll runs once before all the tests

    // Runs before each test
    @BeforeEach
    void setUp() {
        list = new SJArrayList<>();
    }

    @Test
    @DisplayName("List Contains Element")
    void elementContainedReturnsTrueElseFalse() {
        list.add("hello");
        // tests are "Assertions"
        Assertions.assertTrue(list.contains("hello"));
        Assertions.assertFalse(list.contains("world"));
    }

    @Test
    @DisplayName("List size is correct")
    void listSizeIsCorrect() {
        // when comparing, compare expected vs actual
        Assertions.assertEquals(0, list.size());
        list.add("hello");
        Assertions.assertEquals(1, list.size());
    }

    @Test
    @DisplayName("Testing invalid index throws IndexOutOfBoundsException")
    void invalidIndexThrowsIndexOutOfBoundsException() {
        Assertions.assertThrows(IndexOutOfBoundsException.class,
                () -> list.get(-1), "Index cannot be negative.");
        Assertions.assertThrows(IndexOutOfBoundsException.class,
                () -> list.get(1));

    }
}
