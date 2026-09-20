package Day8.Inheritence;

public class StaticInfoInInheritence {
    public static void main(String[] args) {
        KK k = new KK();
       // k.
    }
}

//static information : data memebers or methods : will not participate into inheritence

class TT{
    int x = 100;
    static int y = 200;

    void add(){
        System.out.println("1111111111111");
    }

    static void add(int a){
        System.out.println("1111111111111");
    }
}

class KK extends TT{

}