package Day18;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 10, 11};
        int target = 10;
        System.out.println(binarySearch(arr, target));

    }

    public static int binarySearch(int arr[], int target) {
        int l = 0;
        int r = arr.length - 1;


        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return -1;

    }
}
