package session8;

public class ThreadImpl extends Thread{

    @Override
    public void run() {

        //do operation

        System.out.println("Start operation");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Operation is done");
    }
}
