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
    void getInput(){}
}


public class One {
    public static void main(String[] args) {
        Kiitian student1 = new Kiitian();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student name");
        String name=sc.nextLine();
        System.out.println("Enter the student roll number");
        int roll=sc.nextInt();
        System.out.println("Student Name: "+name);
        System.out.println("Roll Number: "+roll);
        student1.course();
    }
}
