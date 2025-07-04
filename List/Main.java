
//public class Main{
//    public static void main(String[] arg){
//        String name = "Alok";
//        String neighbour = "Deepak";
//        int age = 20;
//        System.out.println(age + " " +name);
//        //byte -1 (-128 to 127)
//        //short 2
//        //int 4 1,2,3
//        //long 8
//        //float 4 3.14
//        //double 8
//        //char 2 a,b,c
//        //boolean 1 true/false
//    }
//}



////        non-primitive types
// With the help of new kayword hm classes ki objects bnate hai.
//non-primitive or reference type create krne ke liye new keyword ki help li jati hai.

//public class Main {
//    public static void main(String[] args) {
//     String name = new String("alok");
//     String friend = new String("Deepak");
//        System.out.println(name.length());
//    }
//}




////      Add 2 strings

//public class Main {
//    public static void main(String[] args) {
//        //string
//        //concatenate
//        String name1 = "alok";
//        String name2 = "Deepak";
//        String name3 = "Rohit";
//        String name4 = name1 + " and " +name2 +" "+ name3;
//        System.out.println(name4);
//    }
//}


//
////       charAt
//
//public class Main {
//    public static void main(String[] args) {
//        //string
//        //chatAt
//        String name = "alok";
//        System.out.println(name.charAt(2));
//    }
//}




////       length of string
//
//public class Main {
//    public static void main(String[] args) {
//        //string
//        //length
//        String name = "alok";
//        System.out.println(name.length());
//    }
//}


////       replace of string. it does not change in main string it creste new string main remain same.
//
//public class Main {
//    public static void main(String[] args) {
//        //string
//        //replace
//        String name = "aaloka";
//        String name2 = name.replace('a','R');
//        System.out.println(name2);
//        System.out.println(name);
//    }
//}


//
////       substring of string. its return the part of string between the points.
////
//public class Main {
//    public static void main(String[] args) {
//        //string
//        //Substring
//        String name = "Alok Pratap Jadon";
//        String name2 = "Deepak";
//        System.out.println(name.substring(4,11));
//    }
//}





////       age in string

//public class Main {
//    public static void main(String[] args) {
//        //string
//        //age
//        int age = 30;
//        int physics=90;
//        int chem = 98;
//        int math = 99;
//        System.out.println(chem + " " + chem);
//    }
//}



////                             ARRAYS

//public class Main{
//    public static void main(String[] args){
//        int[] marks = new int[3];
//        marks[0]= 97;
//        marks[1] =99;
//        marks[2] = 98;
//        System.out.println(marks[2]);
//    }
//}


//
//    //length of array
//
//public class Main{
//    public static void main(String[] args){
//        int[] marks = new int[3];
//        marks[0]= 97;
//        marks[1] =99;
//        marks[2] = 98;
//        System.out.println(marks.length);
//    }
//}




//// Shorting Array
//import java.util.Arrays;
//public class Main{
//    public static void main(String[] args){
//        int[] marks = new int[3];
//        marks[0]= 97;
//        marks[1] =93;
//        marks[2] = 95;
//
//        // sort
//        System.out.println(marks[0])
//        Arrays.sort(marks);
//        System.out.println(marks[0]);
//    }
//}


////  if know the elements already of array
//                                //  2D ARRAY
//import java.util.Arrays;
//public class Main{
//    public static void main(String[] args){
//        int[] marks = {97,98,95};
//
//        int[][] finalMarks = {{97,98,95}, {92,91,99},{88,89,87}};
//        System.out.println(finalMarks[0][2]);
//    }
//}



////    Casting

//import java.util.Arrays;
//public class Main {
//    public static void main(String[] args) {
//     double price = 100.00;
//     double finalPrice = price + 18;
//        System.out.println(finalPrice);
//
//        //explisit casting
//        int price1= 100;
//        int finalPrice2 = price1 + (int)18.99;
//        System.out.println(finalPrice2);
//    }
//}




////    Constants
//
//import java.util.Arrays;
//public class Main {
//    public static void main(String[] args) {
//        int age = 30;
//        age = 12;
//        age = 13;
// //        float PI = 3.14f;
// //        PI = 1.1f;
// //        System.out.println(PI);
////////       Constants(final makes PI constant)
//        final float PI = 3.14f;
//        //now PI is constant its value cant be change in code
//        System.out.println(PI);
//    }
//}




//////    Operators
////
//import java.util.Arrays;
//public class Main{
//    public static void main(String[] args){
//        //operators (=)
//        double a= 1;
//        double b= 2;
//        double c= 3;
//        double d= 4;
//        double sum = a+b+c+d;
//        System.out.println(sum);
//        double diff = d-a;
//        System.out.println(diff);
//        double multiply = c*a;
//        System.out.println(multiply);
//        double divide = c/b;
//        System.out.println(divide);
//        double modulo = c%d;
//        System.out.println(modulo);
//
//// unary operator (++)
//        int num = 1;
//                num++;
//        System.out.println(num);
//        System.out.println(--num);
//    }
//}









////      LinkedList

//import java.util.LinkedList;
//public class Main {
//    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.addFirst(10);    // to add fist node
//        list.add(2,12);    // to add between the list
//        list.removeFirst();    // to delete fist node
//        list.get(1);
//        System.out.println(list.get(1));     // to get the particular value of any node
//        System.out.println(list);
//    }
//}



import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.addFirst(0);
        list.addLast(3);
        list.add(2,54);
        System.out.println(list);
        System.out.println(list.removeLast());
        System.out.println(list.remove(3));
        for(int k:list)
            System.out.println(k+"");
    }
}


