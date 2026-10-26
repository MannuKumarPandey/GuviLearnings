package Day18;

public class BSINRotatedSortedArray {
    public static void main(String[] args) {

        // OA = 1 2 3 4 5 6 7 8 9 10
        //3 times Right rotation
        int[] arr = {8,9,10,1,2,3,4,5,6,7};
        int target = 3;
        System.out.println(bsrsa(arr, target));

    }

    public static int bsrsa (int arr[], int target){
        int l = 0;
        int r = arr.length-1;

        while(l <= r){

            int mid = l +(r-l)/2;

            if(arr[mid] == target ){
                return mid;
            }

            //is first part/half is sorted or not
            if(arr[l] <= arr[mid]){

                //is the sorted half containing our target or not
                if(arr[l] <= target && arr[mid] > target){
                    r = mid-1;
                }else{
                    l = mid+1;
                }

            }else{
                //is the sorted half containing our target or not
                if(arr[mid] < target && arr[r] >= target){
                    l = mid+1;
                }else{
                    l = mid-1;
                }
            }
        }
        return -1;
    }

}
