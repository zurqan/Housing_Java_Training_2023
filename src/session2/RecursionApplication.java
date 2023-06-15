package session2;

public class RecursionApplication {

    public static void main(String[] args) {
        System.out.println("sum(0,0) = " + sum(0, 0));

        System.out.println("add(4,2) = " + add(4, 2));
        System.out.println("add(5,6) = " + add(5, 6));

        System.out.println("add(3,40000) = " + add(3, 40000));
    }


    //assume a and b >=0
    public static int add(int a,int b){
//        return a+b;
        return b==0?a:add(a+1,b-1);//TCE, TCO
    }

    public static int sum(int oldSum, int number){
        return number>10?oldSum:sum(oldSum+number,number+1);
    }

}
