class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class Nine {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgumentException("Not Enough Arguments Passed");
            }
            int sumOfSquares = 0;
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                sumOfSquares += num * num;
            }
            System.out.println("Sum Of Square Of All Numbers " + sumOfSquares);
        } catch (CheckArgumentException e) {
            System.out.println("Output: " + e.getMessage());
        }
    }
}
