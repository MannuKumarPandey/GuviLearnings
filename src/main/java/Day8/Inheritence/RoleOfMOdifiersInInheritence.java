package Day8.Inheritence;

public class RoleOfMOdifiersInInheritence {
    public static void main(String[] args) {
        QQ q = new QQ();
        //q.
    }
}


class PP{

    //below written info : are of default modifier : they will participarte in inh
     String company1 = "HCL";
     void add1(){
        System.out.println("22222222222222");
    }


    //private data members and methdos will not participate into inheritence
    private String company2 = "HCL";
    private void add2(){
        System.out.println("22222222222222");
    }


    //protected data members and methdos will participate into inheritence
    protected String company3 = "HCL";
    protected void add3(){
        System.out.println("22222222222222");
    }

    //public data members and methdos will  participate into inheritence
    public String company4 = "HCL";
    public void add4(){
        System.out.println("22222222222222");
    }

}


class QQ extends PP{

}