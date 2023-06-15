package session2;

public class ConditionalOperation {

    public static void main(String[] args) {

        int number = 5;

        String msg = number >5?"GT 5" :" Not GT 5";

        System.out.println("msg = " + msg);
        String msg2 = number >5?"GT 5" :number==5?"EQ to 5":"LT 5";
        System.out.println("msg2 = " + msg2);
    }
}
