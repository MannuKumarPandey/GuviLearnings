package Day24;

import java.util.Arrays;
import java.util.Stack;

public class NGE {

    public static void main(String[] args) {
        int[]arr = new int[]{10,2,3,111,4,5,6,3,33,545,667};
                           //111, 3, 111, 545, 5, 6, 33, 33, 545, 667, -1


        int len = arr.length;
        int[] nge = new int[len];
        Stack<Integer> stack = new Stack<>();

        for(int i = len-1; i>= 0 ; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                nge[i] = -1;
            }
            else{
                nge[i] = stack.peek();
            }
            stack.push(arr[i]);

        }

        System.out.println(Arrays.toString(nge));
    }
}
