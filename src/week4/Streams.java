/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    static void main() {
        final Integer[] array = {7, 4, 3, 9, 10, 2, 361, 8, 16, 36, 12, 97};
        List<Integer> list = Arrays.asList(array);
        List<Integer> result = list.stream().filter(i -> i % 2 == 1)
                .map(i -> i * 3)
                .collect(Collectors.toList());
        System.out.println(result);
        List<Integer> result2 = list.stream().filter(i -> i % 2 == 1)
                .map(i -> i * 3)
                .toList();
        System.out.println(result2);
        list.stream().filter(i -> i % 2 == 1)
                .map(i -> i * 3)
                .forEach(i -> System.out.println(i));
        long count = list.stream().filter(i -> i % 2 == 1)
                .map(i -> i * 3)
                .count();
        System.out.println(count);
        int sum = list.stream().filter(i -> i % 2 == 1)
                .map(i -> i * 3)
                .mapToInt(Integer::valueOf)
                .sum();
        System.out.println(sum);
        Stream<Integer> stream = list.stream().filter(i -> i % 2 == 1);

    }
}
