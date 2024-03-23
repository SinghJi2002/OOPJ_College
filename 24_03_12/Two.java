public class Two {
    public static void main(String[] args) {
        try{
            int d=0;
            int a=15/d;
            System.out.println("KIIT");
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught");
        }
        System.out.println("After catch statement");
    }
}
