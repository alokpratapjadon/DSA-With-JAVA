package Basics;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total =1;
        if(n==0){
            System.out.println(1);
            return;
        }
        for( int i=1; i<=n; i++){
            total = total*i;
        }
        System.out.println(total);
    }
}
