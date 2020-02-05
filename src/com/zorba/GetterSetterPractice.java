package com.zorba;

public class GetterSetterPractice {
    private int id;
    private  int age;
    private  String Name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return Name;
    }
  /*  public static void getsetter(){

            GetterSetterPractice GS = new GetterSetterPractice();
            GS.setId(1);
            GS.setAge(30);
            GS.setName("Mark");
            System.out.println("The id is : "+GS.getId());
            System.out.println("The Age is : "+GS.getAge());
            System.out.println("The Name is : "+GS.getName());

    }*/

}
