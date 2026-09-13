package Day6;

public class MethodPoint1 {
    public static void main(String[] args) {


        //add 2 values 1000 times
        int x = 10;
        int y = 20;
        int res = x + y;
        System.out.println(res);



        int x1 = 100;
        int y1 = 200;
        int res1 = x1 + y1;
        System.out.println(res1);



        int x2 = 1000;
        int y2 = 2000;
        int res2 = x2 + y2;
        System.out.println(res2);

        System.out.println(add(10,20));
    }

//add : method: reusable code base
    //4 componenets of a method: method name , inputs of mnethods, return type of method, body of method

    //: increasing the readability of code base
    //: reusability of teh code base
    //: high maintainability
    //: Easy to test one set of tasks
    //: seprataion of responsibilities

    static  int add(int x, int y){
        return x+y;
    }
}
