import java.util.*;
public class Area{
	public static void Area(float a){
		System.out.println("Area of circle is "+(3.14*a*a));
	}

	public static void Area(int a){
		System.out.println("Area of sqaure is "+(a*a));
	}
	public static void Area(float a,float b){
		System.out.println("Area of triangle is "+(0.5*a*b));
	}
	
	public static void main(String[] args){
		System.out.println("Enter 1 for sqaure,2 for circle,3 for rectangle");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1){
			System.out.println("Enter sqaure dimensions");
			int a=sc.nextInt();
			Area(a);
		}
		else if(choice==2){
			System.out.println("Enter circle dimensions");
			float a=sc.nextInt();
			Area(a);
		}
		else if(choice==3){
			System.out.println("Enter sqaure dimensions");
			float a=sc.nextInt();
			float b=sc.nextInt();
			Area(a,b);
		}
	}
}