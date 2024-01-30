import java.util.*;
public class Rectangle{
	int length;
	int width;
	int perimeter;
	int area;
	
	
	public Rectangle(int l,int b){
		this.length=l;
		this.width=b;
	}
	
	public void read(){
		System.out.println("The length of rectangle is "+length+" and the breadth "+width);
	}
	
	public void calculate(){
		this.area=length*width;
		this.perimeter=2*(length+width);
	}

	public void display(){
		System.out.println("The perimeter and area of the rectangle are "+perimeter+" "+area);
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimensions of the rectangle");
		int length=sc.nextInt();
		int width=sc.nextInt();
		Rectangle one=new Rectangle(length,width);
		one.read();
		one.calculate();
		one.display();
	}		
}
	
	
	