package Day5;

import java.util.Arrays;

public class DefaultValues {
    public static void main(String[] args) {
        int []a = new int[5];
        System.out.println(Arrays.toString(a));//0

        double []a1 = new double[5];
        System.out.println(Arrays.toString(a1));//0.0

        boolean []a2 = new boolean[5];
        System.out.println(Arrays.toString(a2)); //false

        char []a3 = new char[5];
        System.out.println(Arrays.toString(a3)); // \u0000
    }

}
