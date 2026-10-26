package Day18;

public class LowerBoundInArrayBS {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9, 10,10,10,10,10,10, 12,15};
        int target = 10;

        System.out.println(lowerBoundOfTarget(arr,target));
        System.out.println(upperBoundOfTarget(arr,target));

    }

    public static int lowerBoundOfTarget(int arr[] , int target){
        int l = 0;
        int r = arr.length;

        while(l < r){

            int mid = l +(r-l)/2;

            if(arr[mid] >= target){
                r = mid;
            }else{
                l = mid+1;
            }
        }
        return l;
    }


    public static int upperBoundOfTarget(int arr[] , int target){
        int l = 0;
        int r = arr.length;

        while(l < r){

            int mid = l +(r-l)/2;

            if(arr[mid] > target){
                r = mid;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
}
