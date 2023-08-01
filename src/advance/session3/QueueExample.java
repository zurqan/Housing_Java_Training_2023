package advance.session3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);//FIFO

        while (!queue.isEmpty()){
            System.out.println("queue.peek() = " + queue.peek());
            System.out.println("queue.peek() = " + queue.peek());
            System.out.println("queue.peek() = " + queue.peek());
            System.out.println("queue.poll() = " + queue.poll());
        }



    }
}
