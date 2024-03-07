interface Motor {
    int capacity=10; 

    void run(); 
    void consume();
}
class WashingMachine implements Motor {
    public void run(){}
    public void consume(){}
}
class Two {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        System.out.println("Capacity of the motor is " + wm.capacity);
    }
}
