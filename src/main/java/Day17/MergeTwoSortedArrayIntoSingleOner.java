package Day17;

import java.util.Arrays;

public class MergeTwoSortedArrayIntoSingleOner {

    public static void main(String[] args) {
        int [] arr1 = {1,4,6,8,9,10};
        int arr2[] = new int[]{2,3,5,6,7,8,9};


        int len1 = arr1.length;
        int len2 = arr2.length;

        int res[] = new int[len1 + len2];
        int resP = 0;

        int arr1P = 0;
        int arr2P = 0;

        //both arrays are having elements yet
        while(arr1P < len1 && arr2P < len2){
            if(arr1[arr1P] < arr2[arr2P]){
                res[resP++] = arr1[arr1P++];
            }else{
                res[resP++] = arr2[arr2P++];
            }
        }


        //arr1 is still having some of the elements
        while(arr1P < len1 ){
            res[resP++] = arr1[arr1P++];
        }

        //arr2 is still having some of the elements
        while( arr2P < len2){
            res[resP++] = arr2[arr2P++];
        }


        System.out.println(Arrays.toString(res));

    }
}
