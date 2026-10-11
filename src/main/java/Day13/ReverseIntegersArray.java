package Day13;

import java.util.Arrays;

public class ReverseIntegersArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int len = arr.length;


        int l = 0; //first pointer
        int r = len-1; //second pointer : both aree moving in opposite direction
        while(l < r){//len/2 == O(n/2) === O(n)
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        System.out.println(Arrays.toString(arr));





       /* int []outputArray = new int[len];
        for(int i = len-1; i>= 0; i--){
            outputArray[len-1-i] = arr[i];
        }
        System.out.println(Arrays.toString(outputArray));*/


    }
}
