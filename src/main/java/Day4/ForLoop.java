package Day4;

public class ForLoop {
    public static void main(String[] args) {

        //Loops : for, while, dowhile

        //for : machine : instructions given by you
        //start point, end point , jump factors
        //  start point    destination      jump factor
        for(int x = 1;     x<=40;           x =x+1){
            System.out.println("Mannu Kumar Pandey");
        }


        System.out.println("Now while loop is starting");

        int y = 1;//start point+
        while( y<=40){//end point
            System.out.println("Mannu Kumar Pandey");
            y =y+1;//jum factor
        }


        System.out.println("Now do while loop is starting");

        int z = 1;//start point
        do{
            System.out.println("Mannu Kumar Pandey");
            z =z+1;//jum factor
        }while(z<=40);//end point
    }
}
