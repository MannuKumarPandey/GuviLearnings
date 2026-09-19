package Day7.ClassObjects;

public class Mobile {

    //informastion which are describing the real object
    String color;
    String brandName;
    //----- n no of parameters


    //behavior: tasks getting performed by that object
    void calculate(){

    }


}
class MobileDriver{
    public static void main(String[] args) {
        Mobile mob = new Mobile();// ClassName referenceName = predefinedkeyword  constructor
        System.out.println(mob.brandName);
        System.out.println(mob.color);



    }
}