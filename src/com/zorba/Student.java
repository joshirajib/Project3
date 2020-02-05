package com.zorba;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {

    // if statement
      static int c = 20;

      static int d = 30;

     public  static double area1(){
         if(c > d){
             System.out.println( " The student is passed");
         }

         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter some character");
         String  myChar = sc.nextLine();
         System.out.println(myChar);
         System.out.println("Enter a first number");
         int first_number = sc.nextInt();
         System.out.println("Enter a second number");
         double second_number = sc.nextDouble();
         double add_result = first_number + second_number;
         System.out.println(add_result);
        return add_result;

     }


    }






