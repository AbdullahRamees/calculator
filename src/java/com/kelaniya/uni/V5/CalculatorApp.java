package com.kelaniya.uni.V5;

import com.kelaniya.uni.V5.Input.InvalidInputException;
import com.kelaniya.uni.V5.input.Inputs;
import com.kelaniya.uni.V5.operation.InvalidOperationException;
import com.kelaniya.uni.V5.operation.Operation;
import com.kelaniya.uni.V5.operation.OperationFactory;
import com.kelaniya.uni.V5.repository.NumberRepository;
import com.kelaniya.uni.V5.ui.UI;

import java.io.IOException;

public class CalculatorApp {


    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operationFactory, UI ui) {

        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute() { //we will change this in the future

        try{
            String operator = inputs.getoperator();
            Double[] numbers = numberRepository.getNumber();
            Operation operation = operationFactory.getInstance(operator);
            Double results = operation.execute(numbers);
            ui.showMessage("The result is " + result);
 }catch (InvalidcalOperationExeption| InvalidInputException|number){
            ui.showMassage("Error Occurred!");
        }


    }

}