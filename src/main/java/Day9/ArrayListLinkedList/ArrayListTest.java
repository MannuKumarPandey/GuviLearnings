package Day9.ArrayListLinkedList;


//List -> Interface
//ArrayList isd implementation of List Interface

//Kep point of any collection class in java : properties of that class

//one collection can have n no of objects
//we can add one object in that collecion: Adding
//we can remove from that collection
//we can update any existing object in that collection
//reading is alos possible

import java.util.ArrayList;

public class ArrayListTest {

    //Properties of that class:
    //Internally it stores the information in dynamic array fashion
    //means it will store the information in 0 based indexing
    //insertion order is maintained
    //max size is not required
    //one colelction class can store different data types objects as well
    //Generics nature of collections classes
    //null can be stored in ArrayList
//duplicay of data can be present
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        //al.add("Mannu");
        al.add(null);
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

        for(Integer a: al){
            System.out.println(a);
        }

        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }


        System.out.println(al.size());
        System.out.println(al);
        System.out.println(al.contains(999999));
        System.out.println(al.getFirst());
        System.out.println(al.getLast());

        System.out.println(al.get(6));
    }
}
