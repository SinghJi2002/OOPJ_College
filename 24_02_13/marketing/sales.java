package marketing;
import java.util.Scanner;

import General.employee;
public class sales extends employee {
    public void travelallowance(int basic){
        System.out.println("Salary is "+earning(basic));
        System.out.println("Travel allowance is "+earning(basic)*0.5);
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic");
        sales s=new sales();
        int basic=sc.nextInt();
        int bas=basic;
        s.travelallowance(bas);

    }
}
