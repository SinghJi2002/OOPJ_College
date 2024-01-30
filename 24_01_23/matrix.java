public class matrix{
	public static void main(String[] args){
		int[][] mtrx={{6,7,8},{8,9,2},{1,2,9}};
		int leftDia=0;
		int rightDia=0;
		for(int i=0;i<mtrx.length;i++){
			for(int j=0;j<mtrx.length;j++){
				if(i==j){
					leftDia=leftDia+mtrx[i][j];
				}
				if(mtrx.length-i-1==j){
					rightDia=rightDia+mtrx[i][j];
				}
			}
		}
		System.out.println("Left Diagonal Sum is "+leftDia);
		System.out.println("Right Diagonal Sum is "+rightDia);
	}
}