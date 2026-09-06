package Day4;

public class Pattern1 {
    public static void main(String[] args) {
        /*   5 * 5

         *****
         *****
         *****
         *****
         *****


         */

        //we have 2 directions to be captured
        // rows 5+ columns 5
        //loop is used for rows
        for (int i = 1; i <= 5; i++) {
            //inner loop will be taking care of columns
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
