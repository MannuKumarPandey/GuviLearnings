package Day16;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {


        int arr[] = {3, 1, 2, 5, 4, 6, 7, 8, 9, 50, 30};//
        int len = arr.length;

        //select the min element and then keep that element at its first positions
        //O(n^2)

        for (int i = 0; i < len - 1; i++) {
            int min = i;

            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;


        }

        System.out.println(Arrays.toString(arr));
    }
}

