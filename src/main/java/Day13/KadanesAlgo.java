package Day13;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class KadanesAlgo {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        ArrayList<Integer> result = new ArrayList<>();

        int res = Integer.MIN_VALUE;
        int i = 0;
        int currentRunningSum = 0;
        int maxSum = Integer.MIN_VALUE;
        ArrayList<Integer> al = new ArrayList<>();
        TreeMap<Integer, List<Integer>> tm = new TreeMap<>();
        while (i < nums.length) {
            currentRunningSum += nums[i];

            if (currentRunningSum < nums[i]) {
                al.clear();
                al.add(nums[i]);
            } else {
                al.add(nums[i]);
            }
            if (currentRunningSum > maxSum) {
                result = new ArrayList<>(al);
                maxSum = currentRunningSum;
            }

            currentRunningSum = Math.max(currentRunningSum, nums[i]);
            res = Math.max(res, currentRunningSum);
            i++;
        }

        System.out.println(res);
        System.out.println(result);

    }
}
