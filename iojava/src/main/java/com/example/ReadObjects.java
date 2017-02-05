package com.example;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

/**
 * Created by trusttanapruk on 1/27/2017.
 */

public class ReadObjects {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream oos = new ObjectInputStream(new BufferedInputStream(new FileInputStream("t.tmp")));

        int intValue = oos.readInt();
        String stringObject = (String) oos.readObject();
        Date dateObject = (Date) oos.readObject();
        System.out.println(intValue);
        System.out.println(stringObject);
        System.out.println(dateObject.toString());

        oos.close();
    }
}
