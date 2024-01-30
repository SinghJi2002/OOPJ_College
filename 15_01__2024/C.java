import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Date");
        int date=sc.nextInt();
        if(date>31 && date<0){
            System.out.println("Exit");
        }
        else{
            int module=date%7;
            switch (module) {
                case (1):
                    System.out.println("Monday");
                    break;
                case (2):
                    System.out.println("Teusday");
                    break;
                case (3):
                    System.out.println("Wednesday");
                    break;
                case (4):
                    System.out.println("Thrusday");
                    break;
                case (5):
                    System.out.println("Friday");
                    break;
                case (6):
                    System.out.println("Saturday");
                    break;
                case (0):
                    System.out.println("Sunday");
                    break;
                default:
                    break;
            }
        }
    }    
}
