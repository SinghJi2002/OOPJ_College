package exampractice;

public class CPU {
    private String manufacturer;
    private double price;
    public CPU(String manufacturer,double price){
        this.manufacturer=manufacturer;
        this.price=price;
    }
    public void display(){
        System.out.println(this.manufacturer);
        System.out.println(this.price);
    }
    static class processor{
        private int numcores;
        private String manufacturer;
        public processor(String manufacturer,int numcores){
            this.manufacturer=manufacturer;
            this.numcores=numcores;
        }
        public void display(){
            System.out.println(this.manufacturer);
            System.out.println(this.numcores);
        }
        private void getCache(){}
        private void setCache(){}
    }
    static class ram{
        private double memory;
        private String manufacturer;
        public void display(){
            System.out.println(this.memory);
            System.out.println(this.manufacturer);
        }
        public ram(double memory,String manufacturer){
            this.memory=memory;
            this.manufacturer=manufacturer;
        }
        private void getClockSpeed(){}
        private void setClockSpeed(){}
    }
}
