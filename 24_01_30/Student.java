import java.util.*;
public class Student{
	int roll;
	String name;
	float cgpa;
	
	public Student(){}
	
	public Student(String name,int roll,float cgpa){
		this.roll=roll;
		this.name=name;
		this.cgpa=cgpa;
	}
	

	public void display(){
		System.out.println("Name Of The Student "+name+"\n"+"Roll number of the student "+roll+"\n"+"CGPA of the Student "+cgpa);
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of students");
		int count=sc.nextInt();
		Student[] stud=new Student[10];
		int min=10;
		Student lowest=new Student();
		for(int i=0;i<count;i++){
			System.out.println("Enter the Student Name");
			String name=sc.next();
			System.out.println("Enter the Student Roll");
			int roll=sc.nextInt();
			System.out.println("Enter the Student CGPA");
			float cgpa=sc.nextFloat();
			Student one=new Student(name,roll,cgpa);
			if(cgpa<min){
				lowest=one;
			}
			stud[i]=one;
			one.display();
		}
		System.out.println("Lowest CGPA Student Data is");
		System.out.println(lowest.name);
		System.out.println(lowest.roll);
		System.out.println(lowest.cgpa);
		}		
}
	
	
	