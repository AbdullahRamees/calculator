package com.kelaniya.uni.v1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final FileReader fileReader = new FileReader("numbers.txt");
        final Scanner userInput = new Scanner(System.in);

        int number1 = Integer.parseInt(fileReader.readNumber()[0]);
        int number2 = Integer.parseInt(fileReader.readNumber()[1]);

        boolean isRunning = true;

        System.out.print("Select a Mathematical Operation\n\nFor addition enter 'add'\nFor subtraction enter 'sub'\nFor multiplication enter 'mul'\nTo end the program enter 'end'\n\n");

        while (isRunning) {
            System.out.print("Enter :  ");
            final String calc = userInput.nextLine();
            switch (calc) {
                case "add":
                    Calculate.addition(number1, number2);
                    break;
                case "sub":
                    Calculate.subtraction(number1, number2);
                    break;
                case "mul":
                    Calculate.multiplication(number1, number2);
                    break;
                case "end":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid input. Please enter again.");
            }
        }
    }
}
