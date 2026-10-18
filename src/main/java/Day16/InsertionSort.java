package Day16;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        //one element is already sorted
        //take one data and go in sorted part of array and keep that picked elenment in its correct position
        //how to figure out the correct position:
        //O(n^2)
        int arr[] = {3, 1, 2, 5, 4, 6, 7, 8, 9, 50, 30};
        int len = arr.length;


        for(int i= 1; i < len; i++){
            int key = arr[i];

            int j = i-1;// j = from i-1 to 0
            while(j >= 0 && arr[j] > key){ //travelling from i-1 to 0 and it is also checking upto which index we
                //are getting greater values than key
                arr[j+1] = arr[j];//shifting from j to j+1
                j--;
            }
            arr[j+1] = key;
        }



        System.out.println(Arrays.toString(arr));
    }

}
