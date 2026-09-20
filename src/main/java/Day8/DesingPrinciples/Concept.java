package Day8.DesingPrinciples;

public class Concept {
}
//SOLID principle
//S -> Single responsibility Principle
//Hello !@!!! Keep th eclass in such a way that updating that class will be because of single responsibility

//no reconmended as per designs princpile
class MobileAndLaptop{
    //info of mobile
    //info of laptop
}

///=> recomended one
class Mobile{
}
class Laptop{
}






//O-> Open to extend but close to modify : existing working classes

class Mannu{
    //Mannu is based of mannu's requirement
}

class Mahesh extends Mannu{
    //modify as per your requirement
}


//L-> Liskov Substitution Principle
//substitue teh object of parent class with child's object: it must be follwoed
class A{

}

class B extends A{

}


//I-> Interface Segregation: hello developer , kindly keep the abstract methods inside the interface as minimum as possible
//to reduce the extra burden from the class which is trying to implement it
interface K{
    void disp();
    void disp2();
}

class Y implements K{
    @Override
    public void disp() {

    }
    @Override
    public void disp2() {

    }
}




//D -> Dependency Inversion
interface Communication{
   void sendCommunication();
}

class WhatsppMessage implements Communication{

    @Override
    public void sendCommunication() {
        System.out.println("I am in touch with client via whatspp message !!!!!!!");
    }
}

class Mail implements Communication{
    @Override
    public void sendCommunication() {
        System.out.println("I am in touch with client via Email message !!!!!!!");

    }
}


//here Mail5 is directly ccreating teh dependewncy with class WhatsppMessgae
class Mail5 extends WhatsppMessage{
    @Override
    public void sendCommunication() {
        System.out.println("I am in touch with client via Email message !!!!!!!");

    }
}













