package Day19;

public class LinkedListPresence {
    public static void main(String[] args) {



        int[] arr = {1,2,3,4,5};
        int j=0;//from first index
        while(j<5){//to get the last index
            System.out.println(arr[j]);
            j++;//increase the pointer via j= j+1 to go to next index
        }

        Node obj1 = new Node(20);
        Node obj2 = new Node(21);
        Node obj3 = new Node(27);
        Node obj4 = new Node(35);
        Node obj5 = new Node(46);
        obj1.next = obj2;
        obj2.next = obj3;
        obj3.next = obj4;
        obj4.next = obj5;

        Node i = obj1;//from first object
        while(i != null){//to get the last object
            System.out.println(i.data);
            i= i.next;//i = go to next object via reference
        }



    }

}


class Node{
    int data;
    Node next;

    Node(int data){
        this.data =data;
        this.next = null;
    }

}
