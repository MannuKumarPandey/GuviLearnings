package Day15;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        // System.out.println(sum(new int[]{1,2,3,4,5,6,7,8,9,10}, 0));
       /* Integer arr[] = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(arr);
        */

        System.setProperty(
                "java.util.Arrays.useLegacyMergeSort",
                "false"
        );

        Integer[] arr2 = {5, 3, 1, 4, 2};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

    }


    public static int sum(int arr[], int i) {
        if (i == arr.length) {
            return 0;
        }

        return arr[i] + sum(arr, i + 1);
    }
}
