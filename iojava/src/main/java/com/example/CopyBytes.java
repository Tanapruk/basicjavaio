package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;
        String sentence = "";
        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;


            while ((c = in.read()) != -1) {
                System.out.format("%s is kept in byte code of %s\n", (char) c, c);
                sentence = sentence + (char) c;

                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }

            if (out != null) {
                System.out.println("\nThe whole sentence is\n'" + sentence + "'");
                out.close();
            }
        }
    }

}
