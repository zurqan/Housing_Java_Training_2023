package session6.solvearrayissue;

public class Application {

    public static void main(String[] args) {

        TrainingIntList numbers = new TrainingIntArrayList();
//        numbers.add(1);
//        numbers.add(2);
//        System.out.println("numbers.size() = " + numbers.size());
//        System.out.println("numbers.getNumberAtIndex(0) = " + numbers.getNumberAtIndex(0));
//        System.out.println("numbers.getNumberAtIndex(1) = " + numbers.getNumberAtIndex(1));
//        System.out.println("numbers.getNumberAtIndex(4) = " + numbers.getNumberAtIndex(4));

        for (int i = 0; i < 15; i++) {
            System.out.println("i = " + i);
            numbers.add(i);
        }
        System.out.println("numbers.size() = " + numbers.size());
        System.out.println("numbers = " + numbers);

        numbers.remove(1);
        System.out.println("After remove item at index 1");
        System.out.println("numbers = " + numbers);

    }


}
