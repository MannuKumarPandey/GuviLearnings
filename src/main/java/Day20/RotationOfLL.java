package Day20;

public class RotationOfLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {

        // 20 21 27 35 46
        //k = 3 Left Rotation
        // 35 46 20 21 27 ----- EO of LR
        // 27 35 46 20 21 ----- EO of RR

        Node obj1 = new Node(20);
        Node obj2 = new Node(21);
        Node obj3 = new Node(27);
        Node obj4 = new Node(35);
        Node obj5 = new Node(46);
        obj1.next = obj2;
        obj2.next = obj3;
        obj3.next = obj4;
        obj4.next = obj5;

        //Node res = Leftrotate(obj1, 3);
        Node res = rightRotate(obj1, 3);

        Node temp = res;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Node Leftrotate(Node head, int k){
        int c = 1;
        Node temp = head;
        while(temp.next != null){
            c++;
            temp = temp.next;
        }

        temp.next = head;// we are making it circular

        k = k%c;

        temp = head;

        for(int i = 1; i<k; i++){
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;


        return head;
    }


    public static Node rightRotate(Node head, int k){
        int c = 1;
        Node temp = head;
        while(temp.next != null){
            c++;
            temp = temp.next;
        }

        temp.next = head;// we are making it circular

        k = k%c;

        temp = head;

        for(int i = 1; i<c-k; i++){
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;


        return head;
    }
}
