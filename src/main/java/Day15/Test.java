package Day15;

public class Test {

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,3,4,5,6,7,8,9,10}, 0));
    }

    public static int sum(int arr[], int i){
        if(i == arr.length){
            return 0;
        }

        return arr[i] + sum(arr, i+1);
    }
}
