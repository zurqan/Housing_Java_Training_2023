package session6.innerclasses_example;

public class Application {

    public static void main(String[] args) {

        A.C c = new A.C();
//        A.B b = new A.B();//compilation error
        A a = new A();
        A.B b = a.new B();

        m1(new A());

        class D{

        }
        D d = new D();

    }

    public static void m1(A a){

    }
}
