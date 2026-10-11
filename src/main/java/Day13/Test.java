package Day13;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                List<Integer> subarray = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    subarray.add(arr[k]);
                }
                result.add(subarray);
            }
        }
        System.out.println(result);


        String s = "Mannu";
        ArrayList<String> totalSubArrays = new ArrayList<>();
        int len1 = s.length();
        for (int i = 0; i < len1; i++) {
            for (int j = i; j < len1; j++) {
                totalSubArrays.add(s.substring(i, j + 1));
            }
        }

        System.out.println(totalSubArrays);
    }
}

