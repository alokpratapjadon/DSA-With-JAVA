package Basics;
import java.util.Scanner;

public class HCFof2num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min=Math.min(a,b);
        for(int i=min; i >=1; i--){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
