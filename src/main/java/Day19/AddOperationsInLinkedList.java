package Day19;

public class AddOperationsInLinkedList {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
            this.next = null;
        }

    }

    public static void main(String[] args) {
        addAtFirst(100);
        addAtFirst(99);
        addAtLast(555);
        addAtPosition(3,88888);
        int s = size();
        System.out.println(size());
        System.out.println(getMeTheMiddleNode(s));



        deleteLast();
        deleteFirst();
    }

    public static void addAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        newNode = null;
    }


    public static void addAtLast(int data){
        Node i = head;

        //when given linked has no element
        if(i == null){
            head = new Node(data);
        }

        //when given linked has 1 element
        if(i.next == null){
            head.next = new Node(data);
            return ;
        }

        //other wise
        //taking i pointer/reference to the last object
        while(i.next != null){
            i = i.next;
        }
        //create the new object
        Node newNode = new Node(data);
        //linking the new object from last one
        i.next = newNode;

        //reseting i to null
        i = null;

    }

    public static void addAtPosition(int index , int data){
        Node i = head;
        int c = 1;

        //other wise
        //taking i pointer/reference to the last object
        while(c < index-1){
            i = i.next;
            c++;
        }
        //create the new object
        Node newNode = new Node(data);
        //linking the new object from last one
        newNode.next = i.next;
        i.next = newNode;
        //reseting i to null
        i = null;

    }




    public static void deleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;

    }


    public static int getMeTheMiddleNode(int size){
        int mid = size%2==0?size/2+1:size/2;
        Node i = head;
        int c = 1;
        while(c < mid){
            c++;
            i = i.next;

        }
        return i.data;

    }






    public static void deleteLast(){
        Node i = head;
        //when given linked has no element
        if(i == null){
            System.out.println("Our given Linked List is empty !!!! ");
            return;
        }

        //when given linked has 1 element
        if(i.next == null){
            head = null;
            return ;
        }

        //we are bringing our i reference to second last element
        while(i.next.next != null){
            i = i.next;
        }
        i.next = null;
    }


    public static void deleteAtPosition(int index , int data){
        Node i = head;
        int c = 1;

        //other wise
        //taking i pointer/reference to the last object
        while(c < index-1){
            i = i.next;
            c++;
        }
       // i.next = i.next.next;
        i = null;

    }


    public static int size(){
        Node i = head;
        int c = 0;
        while(i != null){
            c++;
            i = i.next;
        }
        return c;
    }


}
