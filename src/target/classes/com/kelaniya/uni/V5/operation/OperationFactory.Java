package com.kelaniya.uni.V5.operation;

//factory design pattern
public class OperationFactory {
    //after making a dession if you create a object
    //we need to create factory design perton
    public Operation getInstance(String operator){
        Operation operation=null;
        switch (operator) {
            case "add":
                operationperation = new AddOperation();
                break;
            case "sub":
                operationperation = new SubOperation();
                break;
            case "mul":
                operationperation = new MulOperation();
                break;
                case "div":
                operationperation = new DivOperation();
                break;
        }
        return operation;
    }
}