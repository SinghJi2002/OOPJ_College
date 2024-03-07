import java.util.Scanner;

interface Employee {
    void getDetails(int empId, String empName);
}
interface Manager extends Employee {
    void getDeptDetails(int deptId, String deptName);
}
class Head implements Manager,Employee {    
    public void getDetails(int empId, String empName) {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }   
    public void getDeptDetails(int deptId, String deptName) {
        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);
    }
}
class Main {
    public static void main(String[] args) {
        Head head = new Head();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee Id");
        int id=sc.nextInt();
        System.out.println("Enter employee name");
        String name=sc.next();
        System.out.println("Enter department id");
        int did=sc.nextInt();
        System.out.println("Enter deparment name");
        String namedept=sc.next();
        head.getDetails(id, name);
        head.getDeptDetails(did, namedept);
    }
}
