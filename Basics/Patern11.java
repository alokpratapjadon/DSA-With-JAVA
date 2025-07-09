package Basics;

import java.util.Scanner;

public class Patern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print("   ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
