package basic.session6.inhiritance;

public class B extends A{

//        public B(){
//            super();
//        }


    public void bOperation1(){
        System.out.println("B.bOperationMethod");
    }

    @Override
    public void aOperation1() {
        super.aOperation1();
        ///

    }
}
