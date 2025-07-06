package Basics;

import java.util.Scanner;

public class LCMof2Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 1;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        for(int i=max; i<=a*b; i++){
            if(i%a ==0 && i%b ==0){
                System.out.println(i);
                break;
            }
        }
    }
}
