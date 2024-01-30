public class elementCount{
	static int count=0;
	elementCount(){
		count++;
	}
	public static void main(String[] args){
		elementCount ash=new elementCount();
		elementCount dikshant=new elementCount();
		elementCount barun=new elementCount();
		System.out.println(ash.count);
		System.out.println(dikshant.count);
		System.out.println(barun.count);
		
		
	}
}