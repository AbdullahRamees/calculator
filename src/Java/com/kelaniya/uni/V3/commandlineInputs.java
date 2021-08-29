package com.kelaniya.uni.V3;

public class commandlineInputs {

    private final String[] args;

    //constructor of the class
    public commandlineInputs(String[] arguments){
        this.args = arguments;
    }

    public String getOperator(){
        if(args.length==0){
            System.out.println("Please provide the operation as an argument");
            return " "; //will change in the future
        }
        String operator = args[0];
        if(!(operator.equals("add")||operator.equals("sub")||operator.equals("mal"))){
            System.out.println("please provide Add, sub or mul as operator Argument");
            return " ";
        }
        return operator;
    }
}
