package Day7.constructor;

public class ConstructorCallswithThis {

    public static void main(String[] args) {
        new ConstructorCallswithThis();
    }

    //ConstructorCallswithThis = 0 parameterized constructor
    ConstructorCallswithThis(){
        this(100);
        ConstructorCallswithThis(100);//treated as method call : not the constructor calls

    }

    //constructors and methods can be same : but differ uin return type

    ConstructorCallswithThis(int a){
        System.out.println("1 int parameterized constr");
    }

    //example of method with same as constructor name
    void ConstructorCallswithThis(int a){
        System.out.println("ConstructorCallswithThis as method call !!!!!!!!");
    }


    ConstructorCallswithThis(String a){

    }

    ConstructorCallswithThis(String a, int b){

    }
}
