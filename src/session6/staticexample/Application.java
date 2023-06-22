package session6.staticexample;

public class Application {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            A a = new A();
            a.operation();
            System.out.println("================");
            System.out.println("a.getObjCounter() = " + a.getObjCounter());
            System.out.println("a.getClassCounter() = " + A.getClassCounter());
        }
    }
}
