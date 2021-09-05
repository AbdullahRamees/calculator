package com.kelaniya.uni.v1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    private final File file;

    FileReader(String filePath){
        this.file = new File(filePath);
    }

    String[] readNumber() {

        String[] integer = null;

        try {
            final Scanner input = new Scanner(file);
            integer =input.nextLine().split(" ");
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred in reading file.");
            e.printStackTrace();
        }

        return integer;
    }
}
