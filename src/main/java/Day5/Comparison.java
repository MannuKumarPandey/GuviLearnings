package Day5;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Comparison {

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int [] b = a;//array b is pointing tpo array a: here no
        //new object is getting created : the object of a itself is pointing by b
        //one object was cxreated : 2 pointers are created


        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


        System.out.println(a == b);//memory address of a == memory address of b: true 949 == 949
        System.out.println(a.equals(b));//we are comparing vaules of both the arrays index wise: true
    }


}
