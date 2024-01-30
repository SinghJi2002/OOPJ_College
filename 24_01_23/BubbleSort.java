import java.util.Arrays;
public class BubbleSort{
    public static int[] bubbleSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            boolean swap=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    //if a single swap takes place, we turn the swap variable true.
                    swap=true;
                }
            }
            if(!swap){
                break;

            }
        }
        return(arr);
    }
    public static void main(String[] args) {
        int[] arr={1,7,2,4,3,6,5,9};
        int[] sorted_arr=bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(sorted_arr));
    }
}
