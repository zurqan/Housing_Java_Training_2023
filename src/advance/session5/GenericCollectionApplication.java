package advance.session5;

import java.util.ArrayList;
import java.util.List;

public class GenericCollectionApplication {

    public static void main(String[] args) {

        A aObj = new A();
        B bObj = new B();
        C cObj = new C();
        D dObj = new D();

        List<A> aList = new ArrayList<>();
        aList.add(aObj);
        aList.add(bObj);
        aList.add(cObj);
        aList.add(dObj);

        List<B> bList = new ArrayList<>();
//        bList.add(aObj);//compilation error
        bList.add(bObj);
//        bList.add(cObj);//compilation error

        List<C> cList = new ArrayList<>();
//        cList.add(aObj);//compilation error
//        cList.add(bObj);//compilation error

        cList.add(cObj);
        cList.add(dObj);

        List g = new ArrayList();
        //g === List<Object>
        g.add(aObj);
        g.add(bObj);
        g.add(cObj);


        doOperationOnA(aList);
//        doOperationOnA(bList);//compilation error
//        doOperationOnA(cList);//compilation error

//        doOperationOnB(aList);//compilation error
        doOperationOnB(bList);
//        doOperationOnB(cList); //compilation error

//        doOperationOnC(aList);//compilation error
//        doOperationOnC(bList);//compilation error
        doOperationOnC(cList);

        doMoveOnA(aList);
//        doMoveOnA(bList);//compilation error
//        doMoveOnA(cList);//compilation error

        doMoveOnAMoreAdvance(aList);
        doMoveOnAMoreAdvance(bList);
        doMoveOnAMoreAdvance(cList);

    }

    public static void doOperationOnA(List<A> aList){
        aList.add(new C());
    }
    public static void doMoveOnA(List<A> aList){
        for (A a : aList) {
            a.move();
        }
    }
    public static void doMoveOnAMoreAdvance(List<? extends A> aList){
        for (A a : aList) {
            a.move();
        }
//        aList.add(new B());//compilation error
    }

    public static void addAToList(List<? super B> bList){
        bList.add(new B());
    }
    public static void addAToList2(List<B> bList){
        bList.add(new B());
    }

    public static <T> List<T> doOp(T... t){
        return null;
    }
    public static void doOperationOnB(List<B> bList){
    }

    public static void doOperationOnC(List<C> cList){
    }

    public static class A{
        public void move(){}
    }

    public static class B extends A{}

    public static class C extends A{}

    public static class D extends C{}



}
