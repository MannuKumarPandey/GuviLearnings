package Day3;

//Conditional Statements

public class IfElse {

    public static void main(String[] args) {
        // in one hand mobile
        // laptop
        //syntax
       /* if(condition 1){
            //do something
        }else{
            //do someother task
        }*/

        int x = 1001;//one if one else block
        if(x == 100){//
            System.out.println("Give me the mobile !!!!!!!!!!!");
        }
        else{
            System.out.println("I can take laptop!!!!!!!!");
        }



        // 6 conditions : only one will be executed

        int p = 207777770;
        if (p == 100){
            System.out.println("My value is 100");

        }else if (p == 200){
            System.out.println("My value is 200");
        }else if (p == 201){
            System.out.println("My value is 201");
        }
        else if (p == 203){
            System.out.println("My value is 203");
        }else if (p == 205){
            System.out.println("My value is 205");
        }
        else{
            System.out.println("value was"+ p);
        }

    }
}
