package exampractice;
import java.lang.Math;
public class triangle {
    int a;
    int b;
    int c;
    triangle(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public boolean check(){
        if(a+b<c){
            return(false);
        }
        else if(a+c<b){
            return(false);
        }
        else if(c+b<a){
            return(false);
        }
        return(true);
    }

    public double area(){
        if(check()){
            int s=(a+b+c)/2;
            return(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        }
        else{
            return(-1);
        }
    }

    public double perimeter(){
        if(check()){
            int s=(a+b+c)/2;
            return(a+b+c);
        }
        return(-1);
    }
}
