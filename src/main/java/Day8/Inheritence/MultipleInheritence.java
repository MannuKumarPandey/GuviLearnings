package Day8.Inheritence;

public class MultipleInheritence {
}

//Diamond shaped problem : multiple inheritence is not allowed in java: cconfusion to take the info

class A1{

    void add(){
        System.out.println("1111111111111111");
    }
}

class B1{
    void add(){
        System.out.println("222222222222222222");
    }
}

/*
class C1 extends A1, B1{
    void add(){
        System.out.println("1111111111111111");
    }
    void add(){
        System.out.println("222222222222222222");
    }
}*/
