package Basics;

import java.util.Scanner;

public class LCMwithWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i= Math.max(a,b);
        while(i<= a*b){
            if(i%a==0 && i%b==0){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
