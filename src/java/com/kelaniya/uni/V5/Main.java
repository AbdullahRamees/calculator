package com.kelaniya.uni.V5;

import com.kelaniya.uni.V5.ui.CmdLineUI;
import com.kelaniya.uni.V5.ui.UI;
import jdk.internal.util.xml.impl.Input;

import java.io.IOException;

public class Main {
    //Main class is the coordinator now...
    public static void main(String[] args) throws IOException { //kinda wrong!

        Inputs inputs = new commandLineInputs(args);
        String operator = inputs.getOperator();

        NumberRepository numberRepository = new NumberRepository();
        Double[] numbers = numberRepository.getNumbers();
        Double number1 = numbers[0];
        Double number2 = numbers[1];



        //or use a if else statement
        //coordination
        OperationFactory operationFactory = new Operationfactory();
        operation operation = operationFactory.getInstance(operator);
        double result = operationperation.execute(numbers);

       UI cmdLineUi = new UI();
       cmdLineUi.showMessage("The result is "+ result);

       CalculatorApp app = new CalculatorApp(Input,NumberRepository,OperationFactory, UI);
       app.execute();
    }
}
