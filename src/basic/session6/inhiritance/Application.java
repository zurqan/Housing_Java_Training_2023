package basic.session6.inhiritance;

public class Application {

    public static void main(String[] args) {
        A a = new A();
        A a2 = new A(20);
        B b = new B();



//        System.out.println("b = " + b);

//        System.out.println("a = " + a);
        System.out.println("a = " + a.toString());//same as above
        System.out.println("a2 = " + a2);

        System.out.println(a.getSize());
    }
}
