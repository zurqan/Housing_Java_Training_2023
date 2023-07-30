package basic.session6.staticexample;

public class A {

    private int objCounter;

    private static int classCounter;

    public void operation(){
        objCounter++;
        classCounter++;
    }

    public static int getClassCounter() {
        return classCounter;
    }

    public int getObjCounter() {
        return objCounter;
    }
}
