package Day22;

public class StackUsingArray {
    public static void main(String[] args) {
        MyStack s = new MyStack(10);
        /*System.out.println(s.top);//-1
        System.out.println(s.isEmpty());//true
        System.out.println(s.isFull());//false*/


        s.push(100);
       /* System.out.println(s.top);//0
        System.out.println(s.isEmpty());//false
        System.out.println(s.isFull());//false*/


        s.push(101);
        s.push(200);
        s.push(300);
        s.push(400);
        s.push(500);
        s.push(600);
        s.push(700);
        s.push(800);
        s.push(900);//10th object


        System.out.println(s.top);//9
        System.out.println(s.isEmpty());//false
        System.out.println(s.isFull());//true


        System.out.println(s.peek());

        s.pop();
        s.pop();
        s.pop();
        s.pop();

        System.out.println(s.top);//5
        System.out.println(s.isEmpty());//false
        System.out.println(s.isFull());//false


        s.print();

    }
}

class MyStack {
    int[] arr;
    int top;
    int capacity;

    MyStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = data;

    }


    int pop() {
        if (isEmpty()) {
            System.out.println("We donot have any element.");
            return -1;
        }

        int val = arr[top];
        top = top - 1;
        return val;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("We donot have any element.");
            return -1;
        }

        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }


    boolean isFull() {
        return top == capacity - 1;
    }

    void print(){
        if(isEmpty()){
            return;
        }

        for(int i=0; i<=top; i++){
            System.out.println(arr[i]);
        }
    }


}