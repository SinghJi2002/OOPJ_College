public class numCount{
	public static void main(String[] args){
		int[] arr={1,6,9,1,6,9,5,3,4,9};
		int[] count=new int[10];
		for(int i=0;i<arr.length;i++){
			count[arr[i]]++;
		}
		for(int j=0;j<count.length;j++){
			if(count[j]>0){
				System.out.println("Count of " + j + " is " + count[j]);
			}
		}
	}
}