package Basics;

import java.util.Scanner;

public class Patern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int k=n;k>=n-i; k--){
                System.out.print("  ");
            }
            for(int j=n;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
