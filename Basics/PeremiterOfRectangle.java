package Basics;
import java.util.Scanner;
public class PeremiterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int o=n;
        int p=m;
        int Totle = n+m+o+p;
        System.out.println("The perimeter is "+Totle);
    }
}
