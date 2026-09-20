package Day8.Polymorphism;

public class FinalMethodInPolymorphism {
    public static void main(String[] args) {
        WW w = new WW();
        w.add1();

    }
}


class JJJ{

    //final method will participate into inheritance but its modification is not possible by child class
    final void add1(){
        System.out.println("1111111111111111111111");
    }

   final void add2(){
        System.out.println("22222222222222222");
    }


    void add3(){
        System.out.println("333333333333333333333");
    }
    void add4(){
        System.out.println("4444444444444444444");
    }

}

class WW extends JJJ{


    /*@Override
    void add1(){
        System.out.println("JJJJJJJJJJJJJJJJJJJJJJ");
    }*/

    @Override
    void add3(){
        System.out.println("JJJJJJJJJJJJJJJJJJJJJJ");
    }
}