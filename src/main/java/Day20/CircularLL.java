package Day20;

public class CircularLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {

        Node obj1 = new Node(20);
        Node obj2 = new Node(21);
        Node obj3 = new Node(27);
        Node obj4 = new Node(35);
        Node obj5 = new Node(46);
        obj1.next = obj2;
        obj2.next = obj3;
        obj3.next = obj4;
        obj4.next = obj5;

        //last object to first object
        obj5.next = obj1;

        Node i = obj1;
        int c = 0;
        while (true) {
            System.out.println(i.data);
            i = i.next;
            c++;
            if (i == obj1) {
                break;
            }
        }
        System.out.println(c);


    }
}
