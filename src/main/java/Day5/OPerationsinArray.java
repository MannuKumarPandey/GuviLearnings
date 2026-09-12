package Day5;

import java.util.Arrays;

public class OPerationsinArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};

        //C-> create  R-> accessing U-> update  D-> delete/removal

        //Read

        //1st waY
        int length = a.length;//to find the length of any array : object.length;
        for(int i=0;i<length; i++){
            System.out.println(a[i]);
        }


        //2ND WAY
        //for each loop
        for(int tempV : a){
            System.out.println(tempV);
        }


        //3rd way
        System.out.println(Arrays.toString(a));

    }
}
