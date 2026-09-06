package Day4;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //use Scanner class inside java : util.java package
        Scanner scan = new Scanner(System.in);

      /*  System.out.println("Kindly add your name :");
        String name = scan.nextLine();//reading the complete line with all words
        System.out.println("Entered Data is :" + name);

        System.out.println("Kindly add your name 22222 :");
        String firstName = scan.next();//first word of the line
        System.out.println(firstName);*/

        /*System.out.println("Enter the integer");
        int x = scan.nextInt();
        System.out.println(x);*/

      /*  System.out.println("Enter the float");
        float x = scan.nextFloat();
        System.out.println(x);
      */

        /*System.out.println("Enter the double");
        double x = scan.nextDouble();
        System.out.println(x);*/


        //Char given user

        //Mannu -> 0 M, 1 a, 2 n, 3 n, 4 u

        char x = scan.next().charAt(0);//To read the characetr from console /user : first we need to read the first word from line and then
        //read the first character from that word
        System.out.println(x);

    }
}
