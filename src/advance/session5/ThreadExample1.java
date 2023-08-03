package advance.session5;

public class ThreadExample1 {


    public static void main(String[] args) {

        MyThread firstThread = new MyThread("First Thread");
        firstThread.start();
        System.out.println("Main Method");

        Runnable secondThread = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
            System.out.println("Second Thread");
        };
        new Thread(secondThread).start();
    }

    public static class MyThread extends Thread{

        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {

            }
            System.out.println(getName());
        }
    }
}


