package Day14;

import java.util.ArrayList;

public class SubArraysFromArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};// n*(n+1)/2
        int len = arr.length;

        ArrayList<ArrayList<Integer>> subArrays = new ArrayList<>();

        for (int i = 0; i < len; i++) { //at left side boundry
            for (int j = i; j < len; j++) {//at right side boundry

                //1st iteration i = 0 j = 0
                //2nd iteration i = 0 j = 1
                //3rd iteration i = 0 j = 2
                ArrayList<Integer> subArray = new ArrayList<>();
                for(int k = i; k <=j ; k++){
                    subArray.add(arr[k]);
                }
                subArrays.add(subArray);

            }
        }
        System.out.println(subArrays);
    }


}
