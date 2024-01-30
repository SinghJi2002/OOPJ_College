public class evenOdd{
	public static void main(String[] args){
		for(int i=0;i<args.length;i++){
			int num=Integer.parseInt(args[i]);
			if(num%2==0){
				System.out.println(num+" is even");
			}
			else{
				System.out.println(num+" is odd");
			}
		}
	}
}