package advance.session6;

public class ThreadExample4 {


    public static void main(String[] args) {

        DataModel dataModel = new DataModel();

        new Thread(()->{
            System.out.println("Waiting flag to be True");
            while (!dataModel.flag){}
            System.out.println("Done!!!!");
        }).start();

        new Thread(()->{

            int numberOfSeconds = 2;
            System.out.println("Wait "+numberOfSeconds+"  seconds");

            sleep(numberOfSeconds);

            System.out.println("Change Flag to true");
            dataModel.flag=true;
        }).start();

    }

    private static void sleep(int numberOfSeconds) {
        try {
            Thread.sleep(numberOfSeconds *1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static class DataModel{
//        private boolean flag;
        private volatile boolean flag;

    }
}
