package advance.session1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntApplication {

    public static void main(String[] args) {
        int[] numbers = {1,20,40,55,30,13,11,17,102,90,7,9};

        int sum = Arrays
                .stream(numbers)
                .map(a -> a * 3)
                .filter(a -> a > 27)
                .map(n->n+5)
                .sum();

//        Arrays
//                .stream(numbers)
//                .map(a -> a * 3)
//                .filter(a -> a > 27)
//                        .average();
        System.out.println("sum = " + sum);

        String[] names = {"Mohammad","Ahmad","Mosa","Jawad"};
        Stream.of(names)
                .filter(name->name.startsWith("A"))
                .map(name->"Hello "+name)
//                .forEach(System.out::println);
                .forEach(a-> System.out.println(a));

        String[] greetingArray = Stream.of(names)
//                .filter(name -> name.startsWith("A"))
                .map(name -> "Hello " + name)
                .toArray(size -> new String[size]);

        System.out.println(Arrays.toString(greetingArray));

        int sum1 = IntStream.range(1, 101)
                .sum();
        System.out.println("sum1 = " + sum1);

    }
}
