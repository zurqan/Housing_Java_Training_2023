package session3;

import java.util.Arrays;

public class ArrayApplication {


    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers["+i+"] = " + numbers[i]);
        }

        int[] numbers2 = {1,2,3,4,5,6};//numbers2 = new int[6]
        System.out.println("Arrays.toString(numbers2) = " + Arrays.toString(numbers2));


        System.out.println("numbers2.length = " + numbers2.length);

        boolean[] statues = new boolean[5];
        System.out.println("Arrays.toString(statues) = " + Arrays.toString(statues));


        Integer[] numbers3 = new Integer[4];
        System.out.println("Arrays.toString(numbers3) = " + Arrays.toString(numbers3));

        String[] names = new String[3];
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        names[0]="Mohamamd";
        names[1]="Jawad";
        names[2]="Ahmad";
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
//        names[3]="Mosa";//IndexOutOfBoundExc

        String[] names2 = {"Ahmad","Mohammad","Tara"};
        System.out.println("Arrays.toString(names2) = " + Arrays.toString(names2));

        System.out.println("names2 = " + names2);

        Integer[] x= {1,2,3};
        int x1 = x[0];

        int[] numbers7 = new int[7];
        for (int i=0;i<7;i++){
            numbers7[i]=7;
        }
        System.out.println("Arrays.toString(numbers7) = " + Arrays.toString(numbers7));

        Arrays.fill(numbers7,8);
        System.out.println("Arrays.toString(numbers7) = " + Arrays.toString(numbers7));

        int[] newNumbers7 = new int[10];


        int arr1[]={1,2,3};
        int arr2[]=new int[6];
        int i=0;
        for (int j=0;j<3;j++){
            arr2[j]=arr1[j];

        }
        System.out.println("array "+Arrays.toString(arr2));


        int[] n1 = {1,2,3};
        int[] n2 = n1;
        n1[0]=5;
        System.out.println("Arrays.toString(n2) = " + Arrays.toString(n2));

        int[] newN1 = Arrays.copyOf(n1, 10);
        System.out.println("newN1 = " + Arrays.toString(newN1));

        System.out.println(newN1);

        int[] grades = {10,40,90,97,70,31};

        int min=grades[0];
        for(int d=1;d<grades.length;d++) {
            if(min>grades[d]) {
                min=grades[d];
            }
        }
        System.out.println("min="+min);
        int sum  =0 ;
        for (int j = 0; j < grades.length; j++) {
            sum+=grades[j];
        }

        double avg = (double) sum / grades.length;
        System.out.println("average = "+ avg);


        String[] stdNames={"Mohammad","Ahmad","Mosa","Salam","Ali"};
        String[] sportTeam={"Jad","Mohammad","3esa","ali","Yousef"};
        String[] matchesnames = new String[stdNames.length];
        int counter =0 ;
        for (int i1 = 0; i1 < stdNames.length; i1++) {
            for (int i2 = 0; i2 < sportTeam.length; i2++) {

                if(stdNames[i1].equalsIgnoreCase(sportTeam[i2])){
                    System.out.println(stdNames[i1]);
                    matchesnames[counter]= stdNames[i1];
                    counter++;
                    break;
                }

            }

        }
        System.out.println("Arrays.toString(matchesnames) = " + Arrays.toString(matchesnames));



    }

}
