package com.zorba;

public class Main {


    public static void main(String[] args) {
        // if statement
        int a = 20;
        int b = 30;
        if(a>b){
            System.out.println( " The student is passed");
        } else System.out.println("The student is failed");

        // switch statement
        int  score = 60;
        switch(score){
            case 60:
                System.out.println("The score is OK");
                break;
            case 80:
                System.out.println("The score is great");
                break;
            default :
                System.out.println("The there is no score");

        }

        GetterSetterPractice GS = new GetterSetterPractice();
        GS.setId(1);
        GS.setAge(30);
        GS.setName("Mark");
        System.out.println("The id is : "+GS.getId());
        System.out.println("The Age is : "+GS.getAge());
        System.out.println("The Name is : "+GS.getName());
        // Function call.
     // Student.area1();
      //  GetterSetterPractice.getsetter();

    }
}

