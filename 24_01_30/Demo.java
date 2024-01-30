import java.util.*;
public class Demo extends Box{
	int volume;
	public Demo(){
		super(width,height,length);
        }

	public void volume(){
		volume=width*length*height;
		this.volume=volume;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimensions of the box.Length, Width and Height");
		float l=sc.nextInt();
		float w=sc.nextInt();
		float h=sc.nextInt();
		Demo b=new Demo(l,w,h);
		print("Volume Of Box is "+b.volume);
	}
}