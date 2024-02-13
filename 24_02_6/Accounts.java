import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        acc_no = scanner.nextInt();
        System.out.print("Enter balance: ");
        balance = scanner.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    @Override
    void disp() {
        super.disp();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter Aadhar number: ");
        aadhar_no = scanner.nextLong();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class Accounts {
    public static void main(String[] args) {
        System.out.println("Enter the number of accs you want");
        Scanner sc=new Scanner(System.in);
        int max=sc.nextInt();
        Person[] persons = new Person[max];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for person " + (i + 1));
            persons[i] = new Person();
            persons[i].input();
            persons[i].disp();
        }
    }
}
