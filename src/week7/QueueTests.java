/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QueueTests {
    private CircularQueue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new CircularQueue<>();
    }

    @Test
    @DisplayName("Test offer increments size")
    void testOfferIncrementsSize() {
        queue.offer(1);
        Assertions.assertFalse(queue.isEmpty());
    }

    @Test
    @DisplayName("Test offer doesn;t let us add when full")
    void testOfferFullReturnsNull() {
        for (int i = 0; i < 10; ++i) {
            Assertions.assertEquals(i, queue.offer(i));
        }
        Assertions.assertNull(queue.offer(1));
    }
}
