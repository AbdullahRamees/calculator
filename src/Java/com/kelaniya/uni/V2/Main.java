package com.kelaniya.uni.V2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        //make sure validate the argument before using
        if (args.length == 0) {
            System.out.print("please provide a operation as a argument ");
            return;
        }
        String userArgs = args[0];
        if (!("add".equals(userArgs) || "sub".equals(userArgs) || "mul".equals(userArgs))) {
            System.out.println("please provide Add, sub or mul as operator Argument");
            return;
        }
        //reading lines from a file
        List<String> lines = Files.readAllLines(
                Paths.get("C:\\Users\\HP PRO B0OK 450 G7\\Desktop\\my Projects\\Github\\calculator\\Numbers.txt")
        );
        //Adding readed lines to Separate List
        List<Double> numbers = new ArrayList<>();
        numbers.add(0, Double.parseDouble(lines.get(0)));
        numbers.add(1, Double.parseDouble((lines.get(1))));

        //operations
        Double result = 0.00;

        if ("add".equals(userArgs)) {
            result = numbers.get(0) + numbers.get(1);
        } else if ("sub".equals(userArgs)) {
            result = numbers.get(0) - numbers.get(1);
        } else if ("mul".equals(userArgs)) {
            result = numbers.get(0) * numbers.get(1);
        }

        //Printing Results
        System.out.println("the result is " + result);
    }
}
