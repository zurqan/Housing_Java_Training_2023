package advance.session5;

import java.util.concurrent.CountDownLatch;

public class ThreadExample2 {


    public static void main(String[] args) throws InterruptedException {

        DataObject dataObject = new DataObject();

        int numberOfThreads=2;
        int numberOfIteration =100000;
        CountDownLatch countDownLatch = new CountDownLatch(numberOfThreads);

//        for (int i = 0; i < numberOfThreads; i++) {
//            new Thread(()-> {
//                for (int j = 0; j < numberOfIteration; j++) {
//
//                    dataObject.inc();
//                }
//                countDownLatch.countDown();
//            }).start();
//        }
        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(()-> {
                for (int j = 0; j < numberOfIteration; j++) {

                    dataObject.inc2();
                    dataObject.dec2();

                    if(dataObject.count!=0){
                        System.out.println("Not equal to 0, but: "
                                +dataObject.count);
                    }
                }
                countDownLatch.countDown();
            }).start();
        }

        countDownLatch.await();
        System.out.println("dataObject.count = " + dataObject.count);


    }

    public static class DataObject {
        private int count;

        public void inc(){
            count++;
        }
        public synchronized void inc2(){
            count++;
        }
        public synchronized void dec2(){
            count--;
        }
    }
}
