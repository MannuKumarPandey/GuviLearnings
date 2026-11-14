package Day23;

public class QueueUsingLL {

    public static void main(String[] args) {
        QueueUsingLL a = new QueueUsingLL();
        a.enqueue(100);
        a.enqueue(200);
        a.enqueue(300);
        a.enqueue(400);
        a.enqueue(500);

        a.dequeue();


    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node f;
    Node r;
    int size= 0;

    void enqueue(int data){
        Node newNode = new Node(data);
        size++;
        if(f == null && r == null){
            f = newNode;
            r = newNode;
            return;
        }
        r.next = newNode;
        r = newNode;

    }

    int dequeue(){
        if(f == null && r == null){
            System.out.println("Underflow");
            return -1;
        }
        int data = f.data;
        f = f.next;
        size --;
        return data;

    }

    boolean isEmpty(){
        return size == 0;
    }

}
