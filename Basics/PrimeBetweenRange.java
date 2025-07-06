package Basics;

import java.util.Scanner;

public class PrimeBetweenRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int kahaaTakJanaHai=sc.nextInt();
        for(int j=1;j<=kahaaTakJanaHai;j++){
            int n=j;
            boolean isPrime = true;
            for(int i=2; i<n; i++){
                if(n%i==0){
                    isPrime=false;
                    break;}
            }
            if(isPrime ==true){
                System.out.print(n+"   ");
            }
        }




    }
}
