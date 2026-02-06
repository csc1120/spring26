/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class Functional {
    static void main() {
        List<String> list = new ArrayList<>(); // example of an interface

        MathStuff mathStuff = new MathStuff() {
            @Override
            public int math(int a, int b) {
                return a + b;
            }
        };
        System.out.println(mathStuff.math(3, 5));

        mathStuff = (a, b) -> a * b;
        System.out.println(mathStuff.math(3, 5));

        // pass method as parameter
        System.out.println(doMath(36, 7, (a, b) -> {
            int quotient = a / b;
            return quotient * quotient;
        }));

        // Java Built-in Functional Interfaces
        Function<String, Integer> function = String::length;
        System.out.println(function.apply("abc"));

        // Bi-Consumer - 2 input void output
        BiConsumer<Integer, String> biConsumer = (i, s)
                -> {
            String result = "";
            for(int j = 0; j < i; ++j) {
                result += s;
            }
            System.out.println(result);
        };

        biConsumer.accept(6, "dog");


    }

    private static int doMath(int a, int b, MathStuff ms) {
        return ms.math(a, b);
    }
}









