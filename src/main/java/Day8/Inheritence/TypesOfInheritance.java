package Day8.Inheritence;

public class TypesOfInheritance {
    public static void main(String[] args) {
        D bb = new D();
        System.out.println(bb.a);
        bb.taskA();
    }
}


//3rd type : Hierarchical inheritence: where ccombination of single and multilevel inheriutence would be taking place
//one java cclass can be parent for multiple java class
//one java class can not have multiple parent class
class P {//parent for Q and R

}

class Q extends P{

}
class R extends P{

}






//2nd type : Multi level inhertitance
//one parent and one child class
class A{ //parent class for B : only a variable
    int a = 100;
    void taskA(){
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAA");
    }
}


class B extends A{ //B -> child of A , parent of C : 2 info: a, b variables
    int b = 200;

    void taskB(){
        System.out.println("BBBBBBBBBBBBBBBBBBB");
    }
}


class C extends B{ //c-> parent of D child of B: 3 variables : 2 coming from B(a,b) and the third one c
    int c = 300;

    void taskC(){
        System.out.println("CCCCCCCCCCCCCCCCCC");
    }
}

class D extends C{ //D -> child of C
    int d = 400;

    void taskD(){
        System.out.println("DDDDDDDDDDDDDDDD");
    }
}















//1st type : single level inhertitance
//one parent and one child class
class ABC{

}

class DEF extends ABC{

}










