import java.util.Scanner;

class Q1 extends Thread{
    static int lower;
    static int upper;
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName());
            for(int i=lower;i<upper;i++){
                System.out.println(i);
                Thread.sleep(5000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Thread t1=new Q1();
        System.out.println("Enter the name of the thread");
        String name=sc.next();
        t1.setName(name);
        System.out.println("Enter lower counter limit");
        lower=sc.nextInt();
        System.out.println("Enter upper counter limit");
        upper=sc.nextInt();
        t1.start();
    }
}