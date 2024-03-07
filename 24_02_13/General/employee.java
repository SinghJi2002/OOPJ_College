package General;

import java.util.Scanner;

public class employee {
    protected int empid;
    private String ename;
    public double earning(int basic){
        System.out.println("Enter employee id");
        Scanner sc=new Scanner(System.in);
        System.out.println("Employee Id is "+sc.nextLine());
        return(basic+0.8*basic+0.15*basic);
    }
}
