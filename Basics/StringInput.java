package Basics;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s=sc.nextLine();
//        System.out.println(s);


        String s = sc.nextLine();
        char c=s.charAt(10);
        System.out.println(c);
    }
}
