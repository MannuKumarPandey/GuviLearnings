package Day5;

import java.util.Arrays;

public class ArraydataStrc {
    public static void main(String[] args) {

        // 10 20 30 40 50 -> integer
        int x1 = 10;
        int x2 = 20;
        int x3 = 30;
        int x4 = 40;
        int x5 = 50;


        //Array: store the same data types
        //index wise manner
        //0 based indexing

        int [] arr = new int[5];//syntax of array object created with new keyword
        //max size giving is must
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(Arrays.toString(arr));

        char[] arr2 = new char[3];
        arr2[0] = 'a';
        arr2[1]=  'b';
        arr2[2] = 'c';
        System.out.println(Arrays.toString(arr2));

    }
}
