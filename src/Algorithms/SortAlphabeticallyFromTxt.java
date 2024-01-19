package Algorithms;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

public class SortAlphabeticallyFromTxt {
    //VARIABLES
    static File file = new File("src/Txts/1.txt");
    static ArrayList<String> namesList = new ArrayList<String>();

    //Method to get the content of the file and print it
    public static void getFileContentAndSort(File fileName) throws IOException {
        BufferedReader br;
        String line;
        try {
            br = new BufferedReader(new java.io.FileReader(fileName));
            //Skip the first 4 lines of the file
            /*for (int i = 0; i < 3 ; i++) {
                br.readLine();
            }*/
            //Start adding the lines to the Arraylist
            while ((line = br.readLine()) != null) {
                /*In this regex expression the (^) character matches the beginning of the string, and [0-9\\s.]*
                matches any
                digit, whitespace, or dot character zero or more times. The replaceAll method replaces all matches
                with an empty string.*/

                namesList.add(line.replaceAll("^[0-9\\s.\n]*", ""));
            }

            // Sort the words in alphabetical order from the third character.
            /*The Comparator object overrides the compare() method, which takes two String parameters representing the names to be compared. It then returns an integer value that represents the comparison result. In this case, the substring starting from the third character of each name is used for comparison.

            If the substring of the first name is found to be lexicographically less than that of
            the second name, a negative value is returned.
            If it is greater, a positive value is returned.
            If they are equal, zero is returned.
            Once the sorting is completed, the sorted list is stored in the variable 'namesList'.*/

            /*Collections.sort(namesList, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s1.substring(2).compareTo(s2.substring(2));
                }

            });*/

            //Sort the words in alphabetical order
            Collections.sort(namesList, String.CASE_INSENSITIVE_ORDER);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void writeContentToFile() {

        //Write the sorted list to a new txt file
        try {
            OutputStream outputStream = new FileOutputStream("src/Txts/ORDERED.txt");
            //Write to the file in a specific encoding
            Writer writer = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);

            //int writeIndex = 1;

            for (String name : namesList) {
                //writing to the file row by row
                //writer.write(name+"\n");

                //Write an additional new line break for each row
                writer.write(name+"\n\n");

                //Write an index at the beginning of each row
                /*writer.write(writeIndex + ". " + name);
                writeIndex++;*/
            }

            writer.close();

            System.out.println("File created successfully.".toUpperCase());

        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        getFileContentAndSort(file);
        writeContentToFile();
    }
}
