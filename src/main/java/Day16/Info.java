package Day16;

import java.util.Arrays;

public class Info {

    public static void main(String[] args) {
        int [] arr = {2,1,3,4,5,3,4,5,23,6,7,8};
        Arrays.sort(arr);
        //any primitive data types: array: DualPivotQuicksort

        System.out.println(Arrays.toString(arr));


        Integer [] arr2 = {2,1,3,4,5,3,4,5,23,6,7,8};
        Arrays.sort(arr2);//Tim Sort


        System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
        Integer [] arr3 = {2,1,3,4,5,3,4,5,23,6,7,8};
        Arrays.sort(arr3);

        //objects array: Tim Sort   or merge sort




        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
