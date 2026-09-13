package Day6;

public class MultipleMethodsWithSameName {

      //Method Overloading: having multiple methods with same method name but different method signature


    //1: same method signature can not be present multiple times in one java class
    //2: method signature: name of method and input parameters
    //3. duplicate methods



    //1st case: Method name is same, no of input parameters are different
    //different method signature
    void add(){

    }
    void add(int a){

    }


    //2nd case: Method name is same, no of input parameters are same, with different data types
    //different method signature
    void add1(int a){

    }
    void add1(String a){

    }


    //3rd case: Method name is same, no of inpout parameters are same, data types are same but order is different
   //different method signature
    void add (int a, String b){

    }
    void add (String b, int a){

    }


    //4rth condition:
    //return type is not coming in method signature
    //having difference in only return types of methods : we will get compile time errors:
    /*void add10(int a){

    }
    int  add10(int a){
       return 1;
    }*/

}
