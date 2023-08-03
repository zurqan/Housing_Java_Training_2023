package advance.session5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadExample3 {

    public static void main(String[] args) throws InterruptedException {
        DataObject dataObject = new DataObject();

        int numberOfThreads = 200;
        int numberOfIteration = 100000;
        CountDownLatch countDownLatch = new CountDownLatch(numberOfThreads);

        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(() -> {
                for (int j = 0; j < numberOfIteration; j++) {

//                    synchronized (dataObject) {
                        dataObject.inc();
                        dataObject.dec();

                        if (dataObject.count.get() != 0) {
                            System.out.println("Not equal to 0, but: "
                                    + dataObject.count);
                        }
//                    }


                }
                countDownLatch.countDown();
            }).start();


        }
        countDownLatch.await();
        System.out.println("dataObject.count = " + dataObject.count);

    }

    public static class DataObject {
        private AtomicInteger count = new AtomicInteger();


        public void inc() {
            count.incrementAndGet();
        }

        public void dec() {
            count.decrementAndGet();
        }
    }
}
