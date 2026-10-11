package Day13;

import java.util.Arrays;

public class BasicApproachOfSubArraySizeKSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,12,-5,-6,50,3};//2  51 42
        int k = 4;
        int len = arr.length;
        int outputSize = len-k+1;

        int [] res = new int[outputSize];

        for(int i = 0; i<outputSize ; i++){ //
            int sum = 0;
            for(int j = i; j<i+k; j++){
                sum += arr[j];
            }
            res[i] = sum;
        }

        System.out.println(Arrays.toString(res));

    }
}


/*
public double findMaxAverage(int[] arr, int k) {

    double resF = 0;
    int len = arr.length;
    int outputSize = len-k+1;

    double [] res = new double[outputSize];

    for(int i = 0; i<outputSize ; i++){ //
        double sum = 0;
        for(int j = i; j<i+k; j++){
            sum += (double)arr[j];
        }
        res[i] = sum/(double)(k);
        resF = Math.max(resF, res[i]);
    }

    return resF;

}*/
