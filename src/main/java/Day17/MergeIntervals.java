package Day17;

import java.util.Arrays;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{4,6}, {7,9},{11, 18}, {1, 4}};
       /* Arrays.sort(arr, (a,b)->{
            return a[0]-b[0];
        });*/

        Arrays.sort(arr, (a,b)->{
            return a[1]-b[1];
        });

        for(int []a: arr){
            System.out.println(Arrays.toString(a));
        }

    }

}
