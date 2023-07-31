package advance.session2;

import advance.session1.MyFunction;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {


        int[] numbers = {1,20,40,55,30,13,11,17,95,90,7,9,30,55};

        Arrays.stream(numbers)
                .map(a-> {
                    System.out.println(a);
                    return a * 3;
                })
                .filter(a->a>20)
                .peek(a-> System.out.println("peek: "+a))
                .sum();

        int[] sortedNumber = Arrays.stream(numbers)
                .sorted()
                .distinct()
                .toArray();

        System.out.println(Arrays.toString(sortedNumber));

        long count = Arrays.stream(numbers).filter(a -> a < 50).count();
        System.out.println(count);


        boolean anyLess30 = Arrays
                .stream(numbers)
                .anyMatch(a -> a < 30);

        System.out.println(anyLess30);


        Arrays
                .stream(numbers)
                .allMatch(a -> a > 5);

        OptionalInt first = Arrays
                .stream(numbers)
                .filter(a -> a > 5)
                .findFirst();


        Optional<Integer> divide = divide(0, 2);
//        divide
//                .filter(a->a>1)
//                .map(a->a+20)
//                .ifPresent(System.out::println);

        String r = divide
                .map(a -> "Result is " + a)
                .orElse("No Result Found");

        System.out.println(r);

        Integer integer = divide
                .orElse(0);

        Integer integer1 = divide(0, 2).orElse(0);


        int sum = Arrays.stream(numbers)
                .reduce(0, (acc, e) -> acc + e);

        System.out.println(sum);

        int[] n = {1,2,3,4,5};
        int reduce = Arrays.stream(n)
                .reduce(1, (acc, e) -> acc * e);

        System.out.println(reduce);
        OptionalInt reduce1 = Arrays.stream(n)
                .reduce((acc, e) -> acc * e);
        System.out.println(reduce1);

        reduce1
                .ifPresent(System.out::println);

    }



    public static Optional<Integer> divide(int a, int b){
        if(b==0)return Optional.empty();
        return Optional.of(a/b);
    }


    int c =10;
    public int op(int a){

        return a+c;
    }


}
