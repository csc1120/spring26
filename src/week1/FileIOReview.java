/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week1;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Simple examples of FileIO
 */
public class FileIOReview {
    static void main() {
        // Text IO
        Path path = Paths.get("data", "someWords.txt");
        try(Scanner in = new Scanner(path); // can have multiple streams
                PrintWriter pw = new PrintWriter(Paths.get("data", "more", "copy.txt").toFile())) {
            while(in.hasNextLine()) {
                String s = in.nextLine();
                System.out.println(s);
                pw.println(s);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
