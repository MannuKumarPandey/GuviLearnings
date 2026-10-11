package Day13;

public class FixedSizeSW {

    public static void main(String[] args) {
        //int[] arr = {1, 12, -5, -6, 50, 3};
        int[] arr = {-1};
        int len = arr.length;
        int k = 1;
        double actualRes = 0;
        //prepare first window /first result
        double wsum = 0;
        int i=0;
        for ( i = 0; i < k; i++) {
            wsum += (double) arr[i];
        }
        actualRes = wsum / (double) (k);



        for(int j = i; j<len; j++){
            //take new element and add in window sum
            wsum = wsum+(double)arr[j];//adding one new element in window

            wsum = wsum-(double)arr[j-k];//one element is going out of that window

            actualRes = Math.max(actualRes, wsum/(double)k);//calculation of result for the current window is taking place

        }

        System.out.println(actualRes);

        System.out.println(findMaxAverage(new int[]{-1}, 1));


    }


    public static double findMaxAverage(int[] arr, int k) {

        double resF = -99999999;
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

    }
}
