import java.util.Arrays;
import java.util.Scanner;

public class replaceInstance {
    public static void main(String[] args) {
        System.out.println("Enter the instances you want to replace");
        Scanner sc=new Scanner(System.in);
        String replace=sc.nextLine();
        System.out.println("What you want to replace it with");
        String toReplace=sc.nextLine();
        System.out.println("Enter string");
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(replace)){
                arr[i]=toReplace;
            }
        }
        String sol="";
        for(int i=0;i<arr.length;i++){
            sol=sol+arr[i]+" ";
        }
        System.out.println("New String is "+sol);
    }    
}
