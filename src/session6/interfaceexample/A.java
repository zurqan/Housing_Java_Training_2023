package session6.interfaceexample;

public interface A {

     int x =5;
     void op1();

    default int op2(int x){
        return x+5;
    }
    default int op3(int x){
        return x+20;
    }

    static int add(int a,int b){
        return a+b;
    }
}
