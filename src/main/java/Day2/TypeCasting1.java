package Day2;

public class TypeCasting1 {
    public static void main(String[] args) {

        //Widening  + Narrowing

        //byte -> short -> int-> long

        //widening cast of data types : smaller data types -> bigger one
        byte x = 100;
        short y = x; //widening cast
        int t = y;// storing y short(smaller) in int(bigger): widening cast
        long h = t;


        //Narrowing type cast
        long v = 100000l;
        int p = (int) v;


        int ccc= 1000;
        short dd= (short) ccc;
    }
}
