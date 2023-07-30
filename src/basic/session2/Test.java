package basic.session2;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5,6 };

        int[] ints = Arrays.copyOf(array, 10);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));

        int[][] ar = new int[2][3];
        int[] ints1 = ar[0];

        int[][] x= new int[2][];
        x[0]=new int[]{1,2,3,4};
        x[1]=new int[]{1,2};
        System.out.println("["+Arrays.toString(x[0])+","+Arrays.toString(x[1])+"]");

        int left =0;
        int right = array.length-1;
        while (left<right){
            int tmp = array[right];
            array[right]=array[left];
            array[left]=tmp;
            left++;
            right--;
        }
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        System.out.println("x = " + x2);
        int a;
        boolean c;
//        System.out.println("c = " + c);
//        System.out.println("a = " + a);
    }
         static boolean x2 ;
}
