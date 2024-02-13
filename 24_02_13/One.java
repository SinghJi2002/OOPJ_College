import java.util.Scanner;

abstract class Student {
    int rollNo;
    int regNo;
    abstract void getInput();
    abstract void course();
}
class Kiitian extends Student {
    void course() {
        System.out.println("Course: B.Tech");
    }
    void getInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your roll number of the student");
        this.rollNo=sc.nextInt();
        System.out.println("Enter the registration number of the student");
        this.regNo=sc.nextInt();
    }
}


public class One {
    public static void main(String[] args) {
        Kiitian student1 = new Kiitian();
        student1.getInput();
        System.out.println("Roll No: " + student1.rollNo);
        System.out.println("Reg No: " + student1.regNo);
        student1.course();
    }
}
