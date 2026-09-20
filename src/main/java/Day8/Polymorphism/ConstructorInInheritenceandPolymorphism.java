package Day8.Polymorphism;

//The method which is not participating into inheritence : no chance to modify that or no chance to override that





public class ConstructorInInheritenceandPolymorphism {
    public static void main(String[] args) {
        HHHH h = new HHHH();

    }
}


class TTTT{
    TTTT(){
        System.out.println("TTTTTTTTTTTTTT");
    }
}


class HHHH extends TTTT{

    //Constrcutor will never participate into inheritence
    //Reason: invisibly below shared nature of code base would be placed
    //concept or property of constructor to have the same name as per the class will be broken
   /* TTTT(){
        System.out.println("TTTTTTTTTTTTTT");
    }*/

    HHHH(){

    }
}