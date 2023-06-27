package session7.introduction_to_functions;

import session7.TrainingArrayList;
import session7.TrainingList;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Application {

    public static void main(String[] args) {

//        MultBy4 f = new MultBy4();
//        System.out.println("f.apply(10) = " + f.apply(10));

        MyIntFunction mul =x-> x*4;
        MyIntFunction add5 = x->x+5;
        System.out.println("add5.apply(20) = " + add5.apply(20));

        TrainingList<Integer> numbers= TrainingArrayList.of(1,2,3,4,5,6,7,8);
        System.out.println("numbers = " + numbers);

        TrainingList<Integer> evenNumbers = numbers.filter(x -> x % 2 == 0);
        System.out.println(evenNumbers);

        Predicate<Integer> isEven = x -> x % 2 == 0;
        TrainingList<Integer> finalListOfNumbers = numbers
                .filter(isEven)
                .filter(x -> x > 3);


        System.out.println("finalListOfNumbers = " + finalListOfNumbers);
        
        TrainingList<String> names = TrainingArrayList
                .of("Mohammad","Jawad","Awad","Ahmad","Hamad");


        TrainingList<String> aNamedList = names.filter(x -> x.startsWith("A"));
        System.out.println("aNamedList = " + aNamedList);


        TrainingList<Integer> map = names.map(name -> name.length());

        System.out.println(map);

        TrainingList<String> namedV2 = names.map(name -> "The name is: " + name);

        System.out.println(namedV2);

        TrainingArrayList<User> users = TrainingArrayList
                .of(new User("Mohammad", 40, "Amman")
                        , new User("Ahmad", 30, "Irbid")
                        , new User("Awad", 25, "Tafila")
                );

        TrainingList<String> userNames = users.map(user -> user.getName());
        System.out.println("userNames = " + userNames);

        TrainingList<User> usersWithAgeGT27 = users.filter(user -> user.getAge() > 27);

        System.out.println("usersWithAgeGT27 = " + usersWithAgeGT27);

        TrainingList<String> userNameForWhoGT27 = users
                .filter(u -> u.getAge() > 27)
                .map(u -> u.getName());

        System.out.println("userNameForWhoGT27 = " + userNameForWhoGT27);

//        Consumer<String> printStr = str-> System.out.println(str);
//
//        printStr.accept("Mohammad");


//        users
//                .map(user -> user.getName())
//                .forEach(name-> System.out.println(name));
        users
                .map(User::getName)
                .forEach(System.out::println);
    }

    public static class User{
        private final String name;
        private final int age;
        private final String address;

        public User(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
}
