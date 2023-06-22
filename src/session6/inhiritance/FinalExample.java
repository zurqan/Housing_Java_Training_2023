package session6.inhiritance;

public final class FinalExample {//you can not extends
    private final int x;

    public FinalExample(int x) {
        this.x = x;
//        this.x++; compilation error it is immutable
    }

    public final void op1(){//you can nto override

    }
}
