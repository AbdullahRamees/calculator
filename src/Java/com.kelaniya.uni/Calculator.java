package com.kelaniya.uni;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Calculator {
    public static void main(String[] args)  throws IOException  {
        // Reading File
        List<String> lines = Files.readAllLines(Paths.
                get("C:\\Users\\HP PRO B0OK 450 G7\\Desktop\\my Projects\\Github\\calculator\\Numbers.txt"));
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0,Integer.parseInt(lines.get(0)));
        numbers.add(1,Integer.parseInt(lines.get(1)));
        //getting commandline argument
        String userArgs = args[0];
        //
        int result = 0;
        if ("add".equals(userArgs)){
            result = numbers.get(0) + numbers.get(1);
        }
        else if ("sub".equals(userArgs)){
            result = numbers.get(0) - numbers.get(1);
        }
        else if ("mul".equals(userArgs)){
            result = numbers.get(0) * numbers.get(1);
        }

        System.out.println("the result is " + result);
    }
}
