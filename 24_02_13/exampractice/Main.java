package exampractice;

import exampractice.*;
import exampractice.CPU.processor;

public class Main{
    public static void main(String[] args) {
        address one=new homeAddress();
        one.getAddress();
        one=new officeAddress();
        one.getAddress();
        one=new schoolAddress();
        one.getAddress();
        CPU n=new CPU("Lenovo",65000);
        CPU.processor p=new CPU.processor("Intel",8);
        CPU.ram q=new CPU.ram(1, "Nvidia");
        
        n.display();
        
    }
    public static void main() {
        
    }
     


}