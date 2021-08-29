package com.kelaniya.uni.V3;

import com.kelaniya.uni.V3.Oparations.addOperation;
import com.kelaniya.uni.V3.Oparations.muloperation;
import com.kelaniya.uni.V3.Oparations.subOperation;

import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {

        commandlineInputs inputs = new commandlineInputs(args);
        String userArgs = inputs.getOperator();

        fileReader Filereader = new fileReader();
        List<Double> numbers = fileReader.getNumbers();

        //operations
        Double result = 0.00;

        if ("add".equals(userArgs)) {
           addOperation addOperation = new addOperation();
           result =addOperation = addOperation.execute(numbers);
        } else if ("sub".equals(userArgs)) {
            subOperation subOperation = new subOperation();
            result =subOperation = subOperation.execute(numbers);
        } else if ("mul".equals(userArgs)) {
            muloperation muloperation = new muloperation();
            result =muloperation = muloperation.execute(numbers);
        }

        //Printing Results
        System.out.println("the result is " + result);
    }
}
