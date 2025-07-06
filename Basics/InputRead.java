package Basics;
import java.util.Scanner;
public class InputRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        short b = sc.nextShort();
        int c = sc.nextInt();
        long d = sc.nextLong();
//        String e = sc.next();  // String input
        float f = sc.nextFloat();
        double g = sc.nextDouble();
 //       String h = sc.nextLine();// String input

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
      //  System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    //    System.out.println(h);
    }
}
