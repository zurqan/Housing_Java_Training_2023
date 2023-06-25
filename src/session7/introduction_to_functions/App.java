package session7.introduction_to_functions;

public class App {

    public int add(int a,int b){
        return a+b;//pure
    }
    public int add2(int a,int b){
        return a+b+10;//pure
    }

    public void add3(int a,int b){
        System.out.println(a+b);//not a function
    }

    private static int v= 10;
    public int add4(int a,int b){
        return a+b+v;//not pure
    }

    private final static int v2= 10;
    public int add5(int a,int b){
        return a+b+v2;// pure
    }

    public int add6(int a,int b){
        int x =6;
        return a+b;// pure
    }

    public int add7(int a,int b){
        int x =6;
        return a+b+x;// pure
    }
    public int add8(int a,int b){
        System.out.println("a = " + a);
        return a+b;// pure
    }

}
