package Day22;

import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,9,10};

        Stack<Integer> actualOne = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();

        actualOne.push(arr[0]);
        minStack.push(arr[0]);
        maxStack.push(arr[0]);


        for(int i=1; i<arr.length; i++){
            actualOne.push(arr[i]);
            minStack.push(Math.min(arr[i],minStack.peek()));
            maxStack.push(Math.max(arr[i],maxStack.peek()));
        }

        System.out.println(actualOne.toString());
        System.out.println(minStack.toString());
        System.out.println(maxStack.toString());


        actualOne.pop();
        minStack.pop();
        maxStack.pop();

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(actualOne.toString());
        System.out.println(minStack.toString());
        System.out.println(maxStack.toString());


        System.out.println(minStack.peek());
        System.out.println(maxStack.peek());


    }
}
