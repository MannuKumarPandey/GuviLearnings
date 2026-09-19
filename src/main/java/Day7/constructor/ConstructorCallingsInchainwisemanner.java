package Day7.constructor;

public class ConstructorCallingsInchainwisemanner {


    static int age = 100;

    public static void main(String[] args) {
        //this : - oput of static copntents : otherwsie error
        /*System.out.println(this.age);
        this();*/
    }

    void add(){
        //this();//calling one constructor from any method is not allwoed
    }


    ConstructorCallingsInchainwisemanner(){
      //  System.out.println("89098998989808898");:

        this(10);//constructor calling line must be the first line of constructor body

        System.out.println("89098998989808898");

        //this("Mannu"); : when we tried to call multiple constructor from one constructor :
        //then it is nopt allowed : only one constructor call is allowed from any constructor
    }

    ConstructorCallingsInchainwisemanner(int a){


        this("Mannu");
    }

    ConstructorCallingsInchainwisemanner(String b){

    }

    ConstructorCallingsInchainwisemanner(int a, String b){

    }

}
