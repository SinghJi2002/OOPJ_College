import java.util.Scanner;

 class java {
    int a,b,c;
    public java(int a,int b){
        this.a=a;
        this.b=b;
    }
    public java(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
}
   public class j{
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int c=sc.nextInt();
        java one=new java(a, b);
        java two=new java(a, b, c);
    }
   }
