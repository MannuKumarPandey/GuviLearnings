package Day14;

import java.util.Arrays;

public class RightRotationOfAnArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int len = arr.length;
        //right rotation
        int k = 3;
        //steps 1 : reverse last k elements
        reverse(arr, len-k, len-1);

        //steps 2 : reverse first len-k elements
        reverse(arr, 0, len-k-1);

        //steps 3 : reverse complete array
        reverse(arr, 0, len-1);


        System.out.println(Arrays.toString(arr));


    }

    public static void reverse(int arr[], int left , int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
