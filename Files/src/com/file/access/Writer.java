package com.file.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) throws IOException {

        String text = "Computer Science Portal GeeksforGeeks \nJonathan";
        new File("C:\\Users\\NoirPhantom\\Hello.txt");
        
        try {

            BufferedWriter f_writer = new BufferedWriter(new FileWriter(
                    "C:\\Users\\NoirPhantom\\Hello.txt"));

            f_writer.write(text);

            System.out.print(text);

            System.out.print(
                    "\nFile is created successfully with the content.");

            f_writer.close();
        } catch (IOException e) {

            System.out.print(e.getMessage());
        }

    }
}
