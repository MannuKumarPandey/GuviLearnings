package Day17;

import java.util.Arrays;

public class TT {

    public static void main(String[] args) {
        Integer arr[] = new Integer[]{2,3,1,2,6,5,4,5,6,7,3,4,5,0};
        Arrays.sort(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }
}
