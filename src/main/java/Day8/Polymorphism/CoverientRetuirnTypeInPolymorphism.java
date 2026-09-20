package Day8.Polymorphism;

public class CoverientRetuirnTypeInPolymorphism {

    A5 add(){
        System.out.println("111111111111");
        /*A5 a = new A5();
        return a;*/

        B5 b = new B5();// methoid is saying that i will return the object of parent class
        //but returned the object of its child class
        return b;

    }
}


class A5{
    A5 add(){
        return new A5();
    }
}

class B5 extends A5{

    @Override
    B5 add(){
        return new B5();
    }

}//IS A relationship