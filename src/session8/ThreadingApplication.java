package session8;

public class ThreadingApplication {

    public static void main(String[] args) {

        System.out.println("Before Thread");
        ThreadImpl thread = new ThreadImpl();
        thread.start();
        System.out.println("After Thread");


        Thread insideThread = new Thread(() -> {
            System.out.println("Inside Thread");
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Done!");
        });

        insideThread.start();
    }
}
