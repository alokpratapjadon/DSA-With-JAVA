package Basics;
import java.util.Scanner;
public class SimpleIntrest{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Amount: ");
    int paisa = sc.nextInt();
    System.out.print("Enter Your Time Duration: ");
    int timmDuration = sc.nextInt();
    System.out.print("Total Interest Rate: ");
    int interest = sc.nextInt();
    int SimpleInerest = (paisa*timmDuration*interest)/100;
    System.out.print("Your SimpleInterest is : "+SimpleInerest +'\n');
    System.out.print("Your Total Amount to Pay: "+SimpleInerest+paisa);
}
}