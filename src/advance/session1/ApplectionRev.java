package advance.session1;

import java.util.function.Function;

public class ApplectionRev {
    public static void main(String[] args) {
//        Function<Integer,Integer> multBy5=x->x*5;
        MyFunction<Integer,Integer> multBy5=x->x*5;
        MyFunction<String, Integer> length=m -> m.length();
        MyFunction<String,String> greeting = name-> "Hello " + name;
        Integer m = length.apply("Mohammad");
        System.out.println(m);
        System.out.println(greeting.apply("Dababneh"));

        Integer r = multBy5.apply(10);
        System.out.println(r);

//        MyFunction<Integer,Integer> multBy5Impl2=new MyFunction<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer a) {
//                return a*5;
//            }
//        };
    }
}
