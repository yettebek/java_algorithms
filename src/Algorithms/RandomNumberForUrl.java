package Algorithms.Algorithms;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RandomNumberForUrl {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("urls.txt"))) {
            for (int i = 1; i <= 100; i++) {
                int vid_id = (int) (Math.random() * 999999);
                writer.println("www.universalv.io/watch/1" + vid_id);
            }
            System.out.println("Data written to urls.txt successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}