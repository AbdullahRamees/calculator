package com.kelaniya.uni.V3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class fileReader {

    public static List<Double> getNumbers() throws IOException {
        //reding lineas from a file
        List<String> lines = Files.readAllLines(
                Paths.get("C:\\Users\\HP PRO B0OK 450 G7\\Desktop\\my Projects\\Github\\calculator\\Numbers.txt")
        );
        //Adding readed lines to Separate List
        List<Double> numbers = new ArrayList<>();
        numbers.add(0, Double.parseDouble(lines.get(0)));
        numbers.add(1, Double.parseDouble((lines.get(1))));
        return numbers;
    }
}
