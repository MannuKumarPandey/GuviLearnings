package Day9.ArrayListLinkedList;


import java.util.LinkedList;

//Properties of that class:
//Internally it stores the information in Linked List
//means it will store the information in linking way
//insertion order is maintained
//max size is not required
//one collection class can store different data types objects as well
//Generics nature of collections classes
//null can be stored in ListList
//duplicay of data can be present


public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> al = new LinkedList<>();
        al.add(100);
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(1000);
        al.add(2000);
        al.add(3000);
        al.add(4000);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(10000);
        al.add(20000);
        al.add(30000);
        al.add(40000);
        al.addLast(78);


        for(Integer a: al){
            System.out.println(a);
        }

        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }

        System.out.println(al.peekFirst());

        System.out.println(al);
    }
}
