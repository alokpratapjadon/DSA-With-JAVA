package Basics;

import java.util.Scanner;

public class PrimeNumberWithWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i = 2;
        boolean isPrime=true;
        while(i<n){
            if(n%i==0){
                isPrime=false;
                break;
            }i++;
        }
        if(isPrime == true){
            System.out.println("prime number");
        }else{
            System.out.println("not prime number");
        }
    }
}
