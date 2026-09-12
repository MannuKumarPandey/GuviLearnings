package Day5;

import java.util.Arrays;

public class DifferentDatasTypes {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 1;
        a[1]= 'c';//integers array : char directly : ascii representation of teh same in integer
        a[2] = 2;
        System.out.println(Arrays.toString(a));
        System.out.println(a);
    }
}
