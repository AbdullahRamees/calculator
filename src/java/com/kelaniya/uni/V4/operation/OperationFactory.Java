package com.kelaniya.uni.v4.operation;

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
        }
        return operation;
    }
}