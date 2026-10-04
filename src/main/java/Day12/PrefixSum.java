package Day12;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        //Running Sum
        int arr[] = {1,2,3,4};//eo : 1,3,6,10

        int len = arr.length;

        int OA[] = new int[len];

        OA[0] = arr[0];

        for(int i = 1; i<len; i++){
            OA[i] = OA[i-1]+arr[i];
        }

        System.out.println(Arrays.toString(OA));
    }

}
