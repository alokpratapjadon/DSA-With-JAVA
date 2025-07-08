package Basics;
import java.util.Scanner;
public class CompoundIntrest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        doub r = sc.nextInt();
        int t = sc.nextInt();
        int p = sc.nextInt();
        int a=0;
        a = (r/100);
        a=a+1;
        a = (int)Math.pow(a,t);
        a = a*p;
        System.out.println(a);
    }
}
