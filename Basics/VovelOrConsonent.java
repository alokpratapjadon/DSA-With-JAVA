package Basics;
import java.util.Scanner;
public class VovelOrConsonent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char c = n.charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            System.out.println("Vovel");
        }
        else {
            System.out.println("Consonent");
        }

    }

}
