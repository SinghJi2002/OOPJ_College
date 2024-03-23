public class Three {
    public static void main(String[] args) {
        try{
            int d=0;
            int a=15/d;
            int[] x=new int[5];
            x[10]=16;
        }
        catch(ArithmeticException e){
            System.out.println("Arithematic Error");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bond error");
        }
    }    
}
