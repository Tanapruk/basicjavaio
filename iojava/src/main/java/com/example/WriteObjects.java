package com.example;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Created by trusttanapruk on 1/27/2017.
 */

public class WriteObjects {

    public static void main(String[] args) throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("t.tmp")));

        oos.writeInt(12345);
        oos.writeObject("Today");
        oos.writeObject(new Date());

        oos.close();
    }
}
