package Day23;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class CustomDeque {
}

class Test{
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(100);//100
        dq.offerFirst(200);//200 100
        dq.offerLast(300);//200 100 300

        dq.pollFirst();
        dq.pollLast();


        Queue<Integer> q = new ArrayDeque<>();

    }
}
