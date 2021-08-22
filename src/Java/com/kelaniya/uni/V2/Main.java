package com.kelaniya.uni.V2;

public class Main {
    public static void main(String[] args){
        //make sure validate the argument before using
        if (args.length == 0){
            System.out.print("please provide a operation as a argument ");
            return;
        }
        String userArgs = args[0];
        if (!("add".equals(userArgs)||"sub".equals(userArgs)||"mul".equals(userArgs))){
            System.out.println("please provide Add, sub or mul as operator Argument");
            return;
        }
        System.out.print(args[0]);
    }
}
