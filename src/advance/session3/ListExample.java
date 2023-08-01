package advance.session3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;

public class ListExample {

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list.get(2) = " + list.get(2));

        list.stream()
                .forEach(System.out::println);

        boolean b = list.removeIf(a -> a % 2 == 1);
        System.out.println("b = " + b);
        System.out.println("list = " + list);


        List<Integer> list2 = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
        }};

        Iterator<Integer> iterator = list2.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }

        System.out.println("reduce(list2 , (acc,x)-> acc+x ,\"\" ) = " + reduce(list2, (acc, x) -> acc + x, 0));
    }

    public static <T,R> R reduce(List<T> list, BiFunction<R,T,R> accFunction,R initial){
        R result = initial;
        for (T t : list) {
            result = accFunction.apply(result,t);
        }

        return result;
    }
}
