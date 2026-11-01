package Day20;

public class CycleDetection {
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
        Node obj6 = new Node(46);
        obj1.next = obj2;
        obj2.next = obj3;
        obj3.next = obj4;
        obj4.next = obj5;
        obj5.next = obj6;

        //last object to first object
        obj6.next = obj1;

        boolean flag = false;
        Node sp = obj1;
        Node fp = obj1;

        while(fp!= null && fp.next != null){
            sp = sp.next;// 1 step
            fp = fp.next.next;// 2 step

            if(sp ==fp){
                flag = true;
                break;
            }
        }

        System.out.println(flag ? "Cycle" : "No cycle");


    }
}
