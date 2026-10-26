package Day18;

public class MatrixBinarySearch {

    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        int index = binarySearch(arr, target);
        if(index == -1){
            //return false;
        }
        System.out.println();

    }

    public static int binarySearch(int arr[][], int target) {
        int rows = arr.length;
        int cols = arr[0].length;


        int l = 0;
        int r = rows*cols-1;


        while (l <= r) {
            int mid = l + (r - l) / 2;

            int crows = mid/cols;
            int ccols = mid%cols;

            if (arr[crows][ccols] == target) {
                return mid;
            }

            if (arr[crows][ccols] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return -1;

    }
}
