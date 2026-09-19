package Day7.constructor;

public class ThisKeyword {

    //this : inbuilt keyword
    //its accessible inside one java class
    //

    public static void main(String[] args) {
        new Demo().add();
    }
}


class Demo{
    int age = 10;

    void add(){
        Demo a = new Demo(); //objecc a of class demo = this
        System.out.println(a.age);
        a.sub();

        System.out.println(this.age);// this is the inbuild java object created for the class Demo
        this.sub();//calling methods of java class with the help of this object
    }




    void sub(){
        System.out.println("Subtraction !!!!!!!!!!!!!");
    }
}