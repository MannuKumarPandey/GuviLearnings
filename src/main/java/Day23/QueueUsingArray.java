package Day23;

public class QueueUsingArray {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(10);
        q.enqueue(100);
        q.enqueue(200);
        q.enqueue(300);
        q.enqueue(400);
        q.enqueue(500);
        q.enqueue(600);
        q.enqueue(700);
        q.enqueue(800);
        q.enqueue(900);
        q.enqueue(1000);


        System.out.println();
        q.dequeue();

        q.enqueue(99);

    }
}
class MyQueue{
    int arr[];
    int f ;//removal operation
    int r; //insertions
    int capacity;
    int size;

    MyQueue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
        f = 0;
        r = -1;
    }

    void enqueue(int data){
        //overflow
        if(isFull()){
            System.out.println("Queue overflow");
            return;
        }

        r++;
        arr[r] =  data;
        size++;
    }

    int dequeue(){
        //+nce of objects: underflow
        if(isEmpty()){
            System.out.println("Queue underflow");
            return -1;
        }

        int val = arr[f];
        arr[f] = 0;
        f++;
        size--;

        return val;
    }

    boolean isFull(){
        return size == capacity;
    }

    boolean isEmpty(){
        return f > r;
    }

    int peek(){
        //+nce of objects: underflow
        if(isEmpty()){
            System.out.println("Queue underflow");
            return -1;
        }

        return arr[f];
    }

}