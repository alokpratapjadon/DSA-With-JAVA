package Basics;
import java.util.Scanner;
public class CompoundIntrest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double a=0;
        a = (r/100f);
        a=a+1;
        a = Math.pow(a,t);
        a = a*p;
        System.out.println(a);
    }
}
