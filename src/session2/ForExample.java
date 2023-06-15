package session2;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class ForExample {

    public static void main(String[] args) {

 /*       for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        } */

//        for (int i = 0; i < 10; i+=2) {
//            System.out.println("i = " + i);
//        }
        int i = 0;
        for (; i < 10; i+=2) {
            System.out.println("i = " + i);
        }

        System.out.println(" After i = " + i);
        int sum = 0;
        int sum2=0;
        for (int j = 0; j <= 10; j++) {

            if (j%2==0){

                sum +=j;
            }

        }

        System.out.println(sum);
        int sumTo7=0;
        for (int j = 1; j <= 10; j++) {

            if (j%7==0){

                break;
            }
            sumTo7+=j;

        }

        System.out.println("sumTo7 = " + sumTo7);

        for (int j = 0; j <10; j++) {
            if(j%3==0){
                continue;
            }
            System.out.println("j = " + j);
        }

        OUTER: for (int j = 0; j < 10; j++) {
            INNER: for (int k = 0; k < 10; k++) {

                if((j+k)>=5){
                    continue OUTER;
                }
                System.out.println("j: " + j + ", k:" + k);
            }
        }
        String msg = "Hello Mohammad";

        char[] chars = msg.toCharArray();
        for (int index = chars.length-1; index >=0; index--) {
            System.out.println(chars[index]);
        }

        for (char aChar : chars) {
            System.out.println("aChar = " + aChar);
        }
    StringBuilder msg1 = new StringBuilder("");
        for (int index = chars.length-1; index >=0; index--) {
            msg1.append(chars[index]);
        }

        System.out.println("msg1 = " + msg1);

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int number : numbers) {
            System.out.println(number);
        }

        for (int i1 = 0; i1 < numbers.length; i1++) {
            System.out.println("numbers[i1] = " + numbers[i1]);
        }

        for (int i1 = numbers.length - 1; i1 >= 0; i1--) {
            System.out.println("numbers[i1] = " + numbers[i1]);
        }
        int[] numbers2 = new int[]{1,20,3,4,5,60,7,8,9,10};
        int i1 = ThreadLocalRandom.current().nextInt(0, 10);
        System.out.println(i1);

        int[] shuffledArray = new int[numbers2.length];
        shuffledArray[4]=5;//

//        System.out.println("numbers2 = " + numbers2);

//        System.out.println("Arrays.toString(numbers2) = " + Arrays.toString(numbers2));


        for (int index = 0; index < numbers2.length; index++) {
            int randomIndex = ThreadLocalRandom.current().nextInt(0, 10);//generate random index

            swap(numbers2,index,randomIndex);
        }

        System.out.println("Arrays.toString(numbers2) = " + Arrays.toString(numbers2));

    }

    private static void swap(int[] numbers2, int index, int randomIndex) {
        int tmp = numbers2[index];
        numbers2[index]=numbers2[randomIndex];
        numbers2[randomIndex]=tmp;

    }
}
