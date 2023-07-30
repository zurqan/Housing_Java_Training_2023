package basic.session6.inhiritance;

public class A {

    private int size;

    public A() {
//        this.size=10;
        this(10);
        System.out.println("A.A");
    }

    public A(int size) {
        this.size = size;
        System.out.println("A.A with size");
    }

    public void aOperation1(){
        System.out.println("A.aOperation1");
    }

    public void aOperation1(int p0){
        System.out.println("A.aOperation1 with paramter");
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "A{" +
                "size=" + size +
                '}';
    }
}
