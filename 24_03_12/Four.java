public class Four {
    public static void main(String[] args) {
        try {
            
            try {
                
                int[] arr = new int[5];
                arr[10] = 10; 
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out Of Bound Error");
            }
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("String is a null value");
        }
    }
}
