package Day14;

import java.util.Arrays;

public class LeftRotation {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int len = arr.length;
        //left rotation
        int k = 3;


        //steps 1 : reverse first k elements
        reverse(arr, 0, k-1);

        //steps 2 : reverse last len-k elements
        reverse(arr, k, len - 1);

        //steps 3 : reverse complete array
        reverse(arr, 0, len - 1);


        System.out.println(Arrays.toString(arr));


    }

    public static void reverse(int arr[], int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
