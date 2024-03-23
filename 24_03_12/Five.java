import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int[] array = new int[4];
            System.out.print("Enter the numbers:");
            for(int i=0;i<5;i++){
                array[i]=sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out Of Bond Error");
        }
    }
}
