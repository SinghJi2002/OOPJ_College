class outer {
    private int number=100;
    class inner{
        public void display(){
            System.out.println(number);
        }

    }
}
public class Main{
    public static void main(String[] args) {
        outer out=new outer();
        outer.inner in = out.new inner();
        in.display();
    }
}