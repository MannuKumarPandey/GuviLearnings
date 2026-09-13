package Day6;

public class FirstRecorsionProgram {
    public static void main(String[] args) {
        printNumber();
    }


    static int x = 0;

   static  void printNumber() {
        //Base condition : line 10, 11 12
        if (x == 100) {
            return;
        }

        System.out.println(x);//performing the tasks inside the method
        x = x+1;//updated value of the variable/counter which are used inside the condition
        printNumber();//caller line of same method printNumber : recusrion call
    }


}
