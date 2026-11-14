package Day22;

import Day19.AddOperationsInLinkedList;

public class StackUsingLL {

    public static void main(String[] args) {
        StackLL s = new StackLL();
        s.push(100);
        s.push(200);
        s.push(300);
        //System.out.println(s.pop());

        s.pop();
        s.print();
    }


}

class StackLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    Node top;
    int size;

    StackLL() {
        this.top = null;
        this.size = 0;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    int pop() {
        if(isEmpty()){
            System.out.println("Under flow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        size --;
        return val;
    }

    int peek() {
        if(size == 0){
            System.out.println("Under flow");
            return -1;
        }
        int val = top.data;
        return val;
    }

    boolean isEmpty() {
        return size == 0;
    }



    void print() {
        Node temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}