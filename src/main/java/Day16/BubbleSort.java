package Day16;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3,1,2,5,4,6,7,8,9,50,30};
        int len = arr.length;

        //O(n^2)

        for(int i =0; i <len-1; i++){
            for(int j = 0; j<len-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
