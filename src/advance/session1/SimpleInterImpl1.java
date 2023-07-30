package advance.session1;

public class SimpleInterImpl1 implements SimpleInter{
    @Override
    public void print(String a) {
        System.out.println(a);
    }

    @Override
    public String format(String str) {
        return "Formatted "+str;
    }
}
