package Day4;

public class RightAngleTrianglePatter {

    public static void main(String[] args) {
       /*


        *
        **
        ***
        ****
        *****


        */


        //Approach:
        //Lock the row (with outer loops): print all columns(inner loop)

        /*for(int i= 1; i<=5; i++){
            for(int j = 1; j<=i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }*/

        int z= 1;
        do{
            int p = 1;
            do{
                System.out.print("*");
                p++;
            }while(p<=z);
            System.out.println();
            z++;
        }while(z<=5);


    }
}
