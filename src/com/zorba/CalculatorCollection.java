package com.zorba;

import java.util.HashMap;
import java.util.Scanner;

public class CalculatorCollection {
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


    public static void main(String [] args) {
        double num1;
        double num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Number :");
        num1 = sc.nextDouble();
        System.out.println("Enter your Second Number :");
        num2 = sc.nextDouble();

        HashMap <Integer, String>  operatorMap = new HashMap<>();

        operatorMap.put(1, "Addition");
        operatorMap.put(2, "Substraction");
        operatorMap.put(3, "Multiplication");
        operatorMap.put(4, "Division");
        operatorMap.put(5, "Exit");
        System.out.println("Select an operation from the below list");
        int operation = 0;

        while (true){
          for(int i : operatorMap.keySet()){
              System.out.println(i+" > " +operatorMap.get(i));
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
}
