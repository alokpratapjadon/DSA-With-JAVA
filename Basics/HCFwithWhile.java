package Basics;

import java.util.Scanner;

public class HCFwithWhile{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i = Math.min(a,b);
        while (i>=1){
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                break;
            }
            i--;
        }
    }
}
