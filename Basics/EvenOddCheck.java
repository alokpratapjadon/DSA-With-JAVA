package Basics;

import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
}
