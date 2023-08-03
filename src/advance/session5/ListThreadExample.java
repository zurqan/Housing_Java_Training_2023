package advance.session5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

public class ListThreadExample {

    public static void main(String[] args) throws InterruptedException {

        int numberOfTherads=2;

//        List<Integer> list= new ArrayList<>();
        List<Integer> list= new CopyOnWriteArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(numberOfTherads);
        int numberOfIteration= 100000;

        for (int i = 0; i < numberOfTherads; i++) {
            new Thread(()->{
                for (int j = 0; j < numberOfIteration; j++) {
                    list.add(1);
                }
                countDownLatch.countDown();
            }).start();
        }

        countDownLatch.await();
        System.out.println("list.size() = " + list.size());

    }
}
