package com.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by trusttanapruk on 1/25/2017.
 */

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;


        String sentence = "";
        try {
            inputStream = new FileReader("xanadu.txt");
            outputStream = new FileWriter("characteroutput.txt");

            int c;
            String as = "";
            while ((c = inputStream.read()) != -1) {
                System.out.format("%s is kept in byte code of %s\n", (char) c, c);
                sentence = sentence + (char) c;

                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                System.out.println("\nThe whole sentence is\n'" + sentence + "'");
                outputStream.close();
            }
        }
    }
}
