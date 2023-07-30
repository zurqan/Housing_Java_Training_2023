package advance.session1;

public class App {
    public static void main(String[] args) {
        SimpleInter simpleInterImpl1 = new SimpleInterImpl1();
        simpleInterImpl1.print("Mohammad");
        String ahmad = simpleInterImpl1.format("Ahmad");
        System.out.println("ahmad = " + ahmad);

        IntOperation mult5 = new Mult5();
        System.out.println("mult5.apply(10) = " + mult5.apply(10));

        IntOperation m5 =  x-> x*5;


        MyPredicate<Integer> isEven=x->x%2==0;
        System.out.println("isEven.test(100) = " + isEven.test(100));
        System.out.println("isEven.test(101) = " + isEven.test(101));

        MyPredicate<String> isStartWithA = x -> x.startsWith("A");

        System.out.println("isStartWithA.test(\"Ahmad\") = " + isStartWithA.test("Ahmad"));
        System.out.println("isStartWithA.test(\"basel\") = " + isStartWithA.test("basel"));

        MyConsumer<String> print=x-> System.out.println(x);

        print.apply("Mohamamd");

        MySupplier<Double> random= ()->Math.random();

        System.out.println("random.supply() = " + random.supply());
        System.out.println("random.supply() = " + random.supply());
    }

}
