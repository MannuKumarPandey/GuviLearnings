package Day7.constructor;

public class FirstConcept1 {
    public static void main(String[] args) {
        new Dog();
        new Dog("Mannu");
        System.out.println("Main method !!!!!!!!!!");
    }
}



class Dog{

    //1: Constructor name must be same as the class name: we should have one brackets ()
    //2: no return types
    //3: executed when object creation is taking place
    //4: One java class can have n number of constructors
    //5: having differences between no of paratemers, typs of parameters, orders of teh parameters : constructor overloading

    Dog(){
        System.out.println("I am the constructor component !!!!!!");
    }

    Dog(String name){
        System.out.println("I am the constructor component !!!!!! with string 1 parameter");
    }

    Dog(int age){
        System.out.println("I am the constructor component !!!!!! with int 1 parameter");
    }

    Dog(String name, int age){
        System.out.println("I am the constructor component !!!!!! with string and int 2 parameter");
    }
}