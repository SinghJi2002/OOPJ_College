public class Q2 {
    static String[] arr={"I","Love","Java","Very","Much"};
    static class process1 extends Thread{ 
        public void run(){
            Thread.currentThread().setName("Thread 1: ");
            for(int i=0;i<arr.length;i++){
                System.out.println(Thread.currentThread().getName()+arr[i]);
            }
        }
    }
    static class process2 extends Thread{ 
        public void run(){
            Thread.currentThread().setName("Thread 2: ");
            for(int i=0;i<arr.length;i++){
                System.out.println(Thread.currentThread().getName()+arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        process1 t1=new process1();
        process2 t2=new process2();
        t1.setPriority(5);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }
}