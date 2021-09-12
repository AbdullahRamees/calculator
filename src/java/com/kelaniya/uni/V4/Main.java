package com.kelaniya.uni.V4;

import com.kelaniya.uni.V4.operation.AddOperation;
import com.kelaniya.uni.V4.operation.MulOperation;
import com.kelaniya.uni.V4.operation.SubOperation;

import java.io.IOException;

public class Main {

    //Refactoring the code
    //Main class is the coordinator now...
    public static void main(String[] args) throws IOException { //kinda wrong!

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inp

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();
        Double number1 = numbers[0];
        Double number2 = numbers[1];



        //or use a if else statement
        //coordination
        OperationFactory operationFactory = new Operationfactory();
        operation operation = operationFactory.getInstance(operator);
        double result = operationperation.execute(numbers);

       UI ui = new UI();
       ui.showMessage("The result is "+ result);

    }
}
