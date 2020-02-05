package HumanResource;

public class Salary {
    private int  id ;
    private String Department;
    private String position ;


    public static void main(String [] arg) {
        System.out.println("This is the main class");
            Salary sal = new Salary();
            sal.pension();
            sal.getBonus();

    }

    protected double pension(){
        double monthlyPayment =10000;
        float pFact= .1f;
        double myPension = (monthlyPayment * pFact);

        return myPension;
    }

    private void bonus(){
        int monthlyBonus = 100;
        System.out.println("My monthly bonus is "+monthlyBonus);

    }

    public void getBonus(){
        bonus();
        pension();

    }

    int pensionBenefit(){
        System.out.println("This is a default method");
        int b= 10;
        return b;
    }

}
