package Day15;

import java.util.ArrayList;
import java.util.List;

public class SubSetPrtoblems {
    public static void main(String[] args) {
        int []arr = {1,2,3};
        List<List<Integer>> finalRes = new ArrayList<>();
        List<Integer> singleRes = new ArrayList<>();

        subsetHelper(arr, 0, finalRes, singleRes);

        List<List<Integer>> finalRes2 = new ArrayList<>();
        List<Integer> singleRes2 = new ArrayList<>();
        subsetHelper2(arr, 0, finalRes2, singleRes2);

        System.out.println(finalRes);
        System.out.println(finalRes2);


    }
    public static void subsetHelper(int []arr, int start,  List<List<Integer>> finalRes, List<Integer> singleRes){
        if(start == arr.length){
            finalRes.add(new ArrayList<>(singleRes));
            return;
        }


        //step 1- we are adding our index start in single result
        singleRes.add(arr[start]);
        subsetHelper(arr, start+1,   finalRes,  singleRes);

        //step 2- we are removing our index start from single result
        singleRes.remove(singleRes.size()-1);
        subsetHelper(arr, start+1,   finalRes,  singleRes);
    }

    public static void subsetHelper2(int []arr, int start,  List<List<Integer>> finalRes, List<Integer> singleRes){
        /*if(start == arr.length){
            finalRes.add(new ArrayList<>(singleRes));
            return;
        }*/


        finalRes.add(new ArrayList<>(singleRes));

        for(int i = start; i < arr.length; i++) {
            //step 1- we are adding our index start in single result
            singleRes.add(arr[i]);
            subsetHelper(arr, i + 1, finalRes, singleRes);

            //step 2- we are removing our index start from single result
            singleRes.remove(singleRes.size() - 1);
            //subsetHelper(arr, start+1,   finalRes,  singleRes);
        }
    }

    public static void subsetHelper3(int []arr, int start,  List<List<Integer>> finalRes, List<Integer> singleRes){
        /*if(start == arr.length){
            finalRes.add(new ArrayList<>(singleRes));
            return;
        }*/


        finalRes.add(new ArrayList<>(singleRes));
        int i = start;
        while( start < arr.length ) {
            //step 1- we are adding our index start in single result
            singleRes.add(arr[start]);
            subsetHelper(arr, i + 1, finalRes, singleRes);

            //step 2- we are removing our index start from single result
            singleRes.remove(singleRes.size() - 1);
            //subsetHelper(arr, start+1,   finalRes,  singleRes);

            start ++;
        }
    }

}
