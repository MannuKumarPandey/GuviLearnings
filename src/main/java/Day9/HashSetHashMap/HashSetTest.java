package Day9.HashSetHashMap;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetTest {


    //Properties of that class:
//Internally it stores the information in hashing algorithm: hashtables
//means it will store the information hashtables
//insertion order is not maintained
//max size is not required
//one collection class can store different data types objects as well
//Generics nature of collections classes
//null can be stored in hashSet
    //no duplicay of data

    public static void main(String[] args) {
        HashSet<Integer> al = new HashSet<>();
        al.add(null);
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

        for(Integer a: al){
            System.out.println(a);
        }

        System.out.println(al);
    }
}
