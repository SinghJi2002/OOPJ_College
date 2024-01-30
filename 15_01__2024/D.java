import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int number=sc.nextInt();
        int copyNum=number;
        double num=0;
        int numLenght=0;
        while(copyNum>0){
            numLenght++;
            copyNum=copyNum/10;
        }
        numLenght=numLenght-1;
        copyNum=number;
        while(copyNum>0){
            int n=copyNum%10;
            num=num*Math.pow(10, numLenght--);
            copyNum=copyNum/10;
        }
        if(num==number){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }    
}
