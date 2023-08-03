package advance.session4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetApplication {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        boolean is4Added = numbers.add(4);
        boolean is4Added2 = numbers.add(4);

        System.out.println("is4Added = " + is4Added);
        System.out.println("is4Added2 = " + is4Added2);

        String name = "Mohammad";
        String name2 = "Ahmad";
        System.out.println("name.hashCode() = " + name.hashCode());
        System.out.println("name2 = " + name2.hashCode());


        Integer[] numbersAr= {1,2,3,3,5,6,7,4,2,8,1,3,1,2};
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicatedElement = new HashSet<>();

        for (int i = 0; i < numbersAr.length; i++) {
            if (!set.add(numbersAr[i])) {
                duplicatedElement.add(numbersAr[i]);
            }
        }
        System.out.println("duplicatedElement = " + duplicatedElement);

        Set<Integer> distinctarray = Arrays.stream(numbersAr).collect(Collectors.toSet());
        System.out.println("distinctarray = " + distinctarray);


        Integer[] numAr1 = {1,2,3,20,40,10,2,1,3,1,2,3,1};
        Integer[] numAr2 = {1,2,3,20,40,10,10,40};
        Integer[] numAr3 = {11,2,3,20,40,30};

        boolean shouldBeTrue = check(numAr1, numAr2);
        boolean shouldBeFalse = check(numAr1, numAr3);

        System.out.println("shouldBeTrue = " + shouldBeTrue);
        System.out.println("shouldBeFalse = " + shouldBeFalse);


        Set<Integer> setOfData = new HashSet<>(Arrays.asList(numAr1));

        Set<Integer> withoutEvenNumbers = removeEven(setOfData);
        System.out.println("setOfData = " + setOfData);
        System.out.println("withoutEvenNumbers = " + withoutEvenNumbers);

        setOfData.removeIf(e->e%2==0);//Modify same set
        System.out.println("setOfData = " + setOfData);


    }
    public static Set<Integer> removeEven(Set<Integer> numberSet){

        Set<Integer> removeEvenSet = numberSet.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toSet());



        return removeEvenSet;
    }

    public static boolean check(Integer[] ar1,Integer[] ar2){

        Set<Integer> firstSet = Arrays.stream(ar1).collect(Collectors.toSet());
        Set<Integer> secondSet = Arrays.stream(ar2).collect(Collectors.toSet());
        return firstSet.equals(secondSet);
    }
}
