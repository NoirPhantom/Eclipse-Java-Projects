package com.file.access;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {

        // BufferedReader
        BufferedReader read;
        new File("C:\\Users\\NoirPhantom\\Hello.txt");

        read = new BufferedReader(
                new FileReader("C:\\Users\\NoirPhantom\\Desktop\\Hello.txt"));

        String text;

        while ((text = read.readLine()) != null) {
            System.out.println(text);
        }
        read.close();
    }
}
