import java.util.Scanner;
public class Box{
	float width;
	float height;
	float length;

	public Box(){}

	public Box(float w, float l, float h){
		this.width=w;
		this.length=l;
		this.height=h;
	}	

	public float volume(){
		return(width*height*length);
	}
	

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimensions of the box.Length, Width and Height");
		float l=sc.nextInt();
		float w=sc.nextInt();
		float h=sc.nextInt();
		Box b=new Box(l,w,h);
		System.out.println("Volume Of Box is "+b.volume());
	}
}