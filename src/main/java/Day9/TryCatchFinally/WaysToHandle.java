package Day9.TryCatchFinally;

import java.io.FileReader;
import java.io.IOException;

public class WaysToHandle {

    void readFile()  throws IOException {//default exception handler is handling

       /* try {
            FileReader fr = new FileReader("");
        }catch(Exception e){ //your written catch block is handling your exception
            e.printStackTrace();
        }*/


        FileReader fr = new FileReader("");
    }
}
