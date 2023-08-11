package advance.session6;

import java.util.concurrent.CompletableFuture;

public class ComputableFutureExample {

    public static void main(String[] args) {

        CompletableFuture
                .supplyAsync(() -> {
                    sleep(5);
                    return 10;
                }).thenCombine(CompletableFuture.supplyAsync(() -> {
                    sleep(6);
                    return 20;
                }), (a, b) -> {
                    return a + b;
                }).thenAccept(System.out::println);

        sleep(20);
    }

    private static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
