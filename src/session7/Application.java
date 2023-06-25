package session7;

import static session7.TrainingArrayList.of;

public class Application {

    public static void main(String[] args) {

        TrainingList<Integer> numbers = new TrainingArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("numbers = " + numbers);

        TrainingList<String> names = new TrainingArrayList<>();
        names.add("Mohammad");
        names.add("Ahmad");
        System.out.println("names = " + names);


        TrainingArrayList<Integer> numbers2 = of(1,2,3,4,5);
        System.out.println("numbers2 = " + numbers2);

        TrainingArrayList<String> names2 = of("Mohammad","Ahmad","Awad");
        System.out.println("names2 = " + names2);
    }
}
