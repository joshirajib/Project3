package com.zorba;

public class ArrayPractice {

    public static void main(String [] args){
        // Array and While
        int[] myArray = {1,2,3,4,5};
        int index=0;
        while(index<5){
            System.out.println(myArray[index]);
            index++;
        }
        System.out.println("---------------------------");
        // Array and For loop
        for(index=0;index<5; index++){
            System.out.println(myArray[index]);
        }
        System.out.println("----------------");
        //Array and For loop in a better way
        for(int element : myArray){
            System.out.println(element);

        }


    }
}
