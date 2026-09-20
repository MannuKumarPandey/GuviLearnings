package Day8.Polymorphism;

public class ConceptOfPolymorphism {

    //Polymorphism => one component in many forms

    //Polymorphism -> 2 types
    //1) Compile time polymorphism : method overloading: one componenet : method : same name :
    //2) Method overriding : run time polymorphism ->

    public static void main(String[] args) {
        M m = new M();
        m.add();
    }

}


class L{
    void add (){
        System.out.println("111111111111111111");
    }
}

class M extends L{
    //child class is changing the data inside that method
    //Method overriding

    @Override //annotation: hello compiler the below written method is modified by child class
    void add (){
        System.out.println("111111111111111111");
        System.out.println("44444444444444");
    }

    /*@Override //the method which is not coming from parent class : and then child class want to add
    //override annotation : not allowed
    void sub(){
        System.out.println("999999999999999999999");
    }*/
}