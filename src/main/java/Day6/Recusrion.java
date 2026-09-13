package Day6;

public class Recusrion {
    public static void main(String[] args) {
        add(); //caller line
    }

   static  void add(){ //called methods

        //required : to know the concept of something which will break the calls
       //infinite call
       //Base Condition: which will help us out to stop the calls at5 our required times


       //problem: control is never getting realesed: it is trap[ped in infinite call:
       //code was written by developer
        System.out.println();
       add(); //caller line : method which is calling itself: recursion


    }



}
