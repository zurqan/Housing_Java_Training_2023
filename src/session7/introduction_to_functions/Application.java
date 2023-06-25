package session7.introduction_to_functions;

public class Application {

    public static void main(String[] args) {

//        MultBy4 f = new MultBy4();
//        System.out.println("f.apply(10) = " + f.apply(10));

        MyIntFunction mul =x-> x*4;
        MyIntFunction add5 = x->x+5;
        System.out.println("add5.apply(20) = " + add5.apply(20));
    }
}
