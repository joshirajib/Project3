package com.zorba;

import java.util.Scanner;

    public class Calculator {
        // global variable declaration
        static  double num1;
    static double num2;

    public static void main( String [] args){
        // Manual Input of numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Number :");
        num1 = sc.nextDouble();
        System.out.println("Enter your Second Number :");
        num2 = sc.nextDouble();

        //Select  a operation
        System.out.println("Select an operation from the below list");
        int operation = 0;
        int selection[]= {1,2,3,4,5};
        String operator[]={ "Addition", "Substraction","Multiplication","Division", "Exit"};

        // using while
        while (true){

        for(int i =0; i<selection.length; i++ ) {
            System.out.println(selection[i]+" > " + operator[i]);

        }
        operation = sc.nextInt();
        if(operation <1 || operation>5){
            System.out.println("Wrong operation selection");
            continue;
        }
        if (operation == 1) {
                System.out.println("The addition is shown below");
                Calculator.add(num1, num2);
        } else if (operation == 2) {
                System.out.println("The substration  is shown below");
                Calculator.substract(num1, num2);
        } else if (operation == 3) {
                System.out.println("The Multiplication is shown below");
                Calculator.multiply(num1, num2);
        } else if (operation == 4) {
                System.out.println("The Division is shown below");
                Calculator.division(num1, num2);

        } else if (operation == 5) {
                System.out.println(" The operation is completed");
                break;
               // System.exit(0);
        }
        }
    }
    // Add Method
    public static  double add(double num1, double num2){
        double result = num1 + num2;
        System.out.println(result);
        return result;
    }
    // Substract Method
    public static  double substract(double num1, double num2){
        double result = num1 - num2;
        System.out.println(result);
        return result;
    }
    // Multiply method
    public static  double multiply(double num1, double num2){
        double result = num1 * num2;
        System.out.println(result);
        return result;
    }
    // division method
    public static  double division(double num1, double num2){
        double result = num1/ num2;
        System.out.println(result);
        return result;
    }
}
