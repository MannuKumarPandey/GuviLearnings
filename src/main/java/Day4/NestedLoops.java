package Day4;

public class NestedLoops {

    public static void main(String[] args) {


        //One loop will be present inside another loop

        for(int i = 1; i<= 10; i++){ //outer loop
            //i = 1,2,3,4,5,6,7,8,9,10

            for(int j = 1; j<=10; j++){ //inner loop
                //j = 1,2,3,4,5,6,7,8,9,10
                if(j == 5){
                    break;// in case of nested loops , if we have break statement in inner loop then only the inner loop
                    //would be stooped and still outer loop will continue its workings
                }
                System.out.println("Mannu");
            }

        }



    }
}
