package DayRecap10And11;

public class MultiThreadingTest {

    public static void main(String[] args) {

        //In case of java programs: By default we have single threaded nature :
        // Means only one thread called as main thread will be given to us for our execution
        //main thread = control flow  executor
        System.out.println("111111111111111111111111");//1 thread is main with Thread Scheduler
        System.out.println(Thread.currentThread());//1 thread is main with Thread Scheduler
        System.out.println("2222222222222222222");//1 thread is main with Thread Scheduler
        System.out.println("333333333333333");//1 thread is main with Thread Scheduler

        //Now if we want multiple thread then from where we will get it ?
        //we have to create our own threads via codes
        //codes written for multi threadings will be executed by main thread


      /*  RameshThread rameshthread = new RameshThread();//1 thread is main with Thread Scheduler
        RekhaThread rekhaThread = new RekhaThread();//1 thread is main with Thread Scheduler
        MannuThread mannuThread = new MannuThread();//1 thread is main with Thread Scheduler
        rameshthread.run(); //2 thread is main + ramesh with Thread Scheduler
        rekhaThread.run();//3 thread is main + ramesh  + rekha with Thread Scheduler
        mannuThread.run();//4 thread is main + ramesh  + rekha + mannu with Thread Scheduler*/

        //Thread Scheduler : assignment to the work of threads would be in random fashion

        RajuThread rj = new RajuThread();
        rj.start();

        RajeshThread rj2 = new RajeshThread();
        rj2.start();
    }

}

class RameshThread implements Runnable {
    @Override
    public void run() { //the work which Ramesh thread wants to execute must be written inside this
        for (int i = 0; i < 1000; i++) {
            System.out.println("Ramesh:::::::::::::::::");
        }
    }
}

class RekhaThread implements Runnable {
    @Override
    public void run() { //the work which Ramesh thread wants to execute must be written inside this
        for (int i = 0; i < 1000; i++) {
            System.out.println("Rekha:::::::::::::::::");
        }
    }
}

class MannuThread implements Runnable {
    @Override
    public void run() { //the work which Ramesh thread wants to execute must be written inside this
        for (int i = 0; i < 1000; i++) {
            System.out.println("Mannu:::::::::::::::::");
        }
    }
}

class RajuThread extends Thread {
    @Override
    public void run() { //the work which Ramesh thread wants to execute must be written inside this
        for (int i = 0; i < 10000; i++) {
            System.out.println("Raju:::::::::::::::::" + i);
        }
    }
}

class RajeshThread extends Thread {
    @Override
    public void run() { //the work which Ramesh thread wants to execute must be written inside this
        for (int i = 0; i < 10000; i++) {
            if(i == 8888){
                int x = 12/0;
            }
            System.out.println("Rajesh:::::::::::::::::"+ i);
        }
    }
}