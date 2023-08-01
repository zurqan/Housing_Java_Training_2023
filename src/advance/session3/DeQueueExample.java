package advance.session3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DeQueueExample {

    public static void main(String[] args) {

//        Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        deque.push(1);
        deque.push(2);
        deque.push(3);

        while (!deque.isEmpty()){
            System.out.println("deque.poll() = " + deque.poll());
        }
    }
}
