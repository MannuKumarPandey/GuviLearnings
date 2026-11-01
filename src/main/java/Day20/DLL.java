package Day20;

public class DLL {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static void main(String[] args) {

        Node obj1 = new Node(20);
        Node obj2 = new Node(21);
        Node obj3 = new Node(27);
        Node obj4 = new Node(35);
        Node obj5 = new Node(46);
        Node obj6 = new Node(47);

        obj1.next = obj2;//obj1.prev = null

        obj2.next = obj3;
        obj2.prev = obj1;


        obj3.next = obj4;
        obj3.prev = obj2;



        obj4.next = obj5;
        obj4.prev = obj3;


        obj5.next = obj6;
        obj5.prev = obj4;

        obj6.prev = obj5;
        //obj6.next = null


        //travel in forward direction
        Node temp = obj1;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);


        System.out.println("Now Backward:::::::::::::::::::::::::::");

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.prev;
        }


    }

}
