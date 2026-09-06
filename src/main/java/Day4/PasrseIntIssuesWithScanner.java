package Day4;

import java.util.Scanner;

public class PasrseIntIssuesWithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number   ");
        try {
            int ss = scan.nextInt();
            System.out.println(ss);
        }catch(Exception a){
            System.out.println("Your entered value is not proper integer.");
        }
    }
}
