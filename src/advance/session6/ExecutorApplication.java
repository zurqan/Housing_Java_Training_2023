package advance.session6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorApplication {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(()->{
            System.out.println("start task 1");
            sleep(9);
            System.out.println("Done task 1");
        });
        executorService.submit(()->{
            System.out.println("start task 2");
            sleep(4);
            System.out.println("Done task 2");

        });
        executorService.submit(()->{
            System.out.println("start task 3");
            sleep(20);
            System.out.println("Done task 3");

        });
        executorService.submit(()->{
            System.out.println("task 4");
            sleep(6);
            System.out.println("Done task 4");

        });
        executorService.submit(()->{
            System.out.println("task 5");
            sleep(20);
            System.out.println("Done task 5");

        });
    }

    private static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
