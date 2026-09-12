package Day5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9, 10};//10 objects memory was given

        //insertion and deletion of array
        // work to be done
        //insert 99 at index 2
        //1) create a new object with size oldersize + 1 = 11
        //2) copy all the values from older array before the target index aa = [1,2]
        //3) indert new value at target index = [1,2,99]
       //4) copy the rest elements of older array in new array  ==[1,2,99,3,4,5,6,7,8,9 ,10]


        int []a2 = {1,2,3,4,5};
        //insert 22 at index 1
        int lengthOfOlderArray = a2.length;
        int newLengthOfArray = lengthOfOlderArray+1;


        //task 1: created new array
        int [] newArray = new int[newLengthOfArray];

        int targetIndex = 1; //coming from problem statement
        //task 2: copy the all all teh data from older to new array before the target index
        for(int i = 0; i<targetIndex; i++){
            newArray[i ] = a2[i];
        }


        //task 3: copy the target index value in new array
        newArray[targetIndex] = 22;

        //task 4: copy rest all elements from older to new array
        for(int i = targetIndex+1; i<newLengthOfArray; i++){
            newArray[i] = a2[i-1];
        }

        System.out.println(Arrays.toString(newArray));

        //in deletion:
        //target index from older array
        //1) create a new array with size of older array - 1
        //2) ccopy all the elements before target index from older to new array
        //3rd skip the target index
        //4) ccopy rest elements post target index
    }
}
