import java.util.Scanner;

interface Employee {
    void earnings(double basic);
    void deductions(double basic);
    default void bonus(double basic){};
}


class Manager implements Employee { 
    public void earnings(double basic) {
        double earn=basic + (0.80 * basic) + (0.15 * basic);
        System.out.println("Earning "+earn); 
    }   
    public void deductions(double basic) {
        double deduct=0.12 * basic;
        System.out.println("Deduction "+deduct); 
    }
}
class Substaff extends Manager {
    public void earnings(double basic) {
        double earn=basic + (0.80 * basic) + (0.15 * basic);
        System.out.println("Earning "+earn); 
    }   
    public void deductions(double basic) {
        double deduct=0.12 * basic;
        System.out.println("Deduction "+deduct); 
    }
    public void bonus(double basic) {
        double bon=0.5*basic;
        System.out.println("Bonus "+bon);
    }
}


public class three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic salary");
        double basicSalary = sc.nextInt();
        Substaff substaff = new Substaff();
        substaff.earnings(basicSalary);
        substaff.bonus(basicSalary);
        substaff.deductions(basicSalary);
    }
}
