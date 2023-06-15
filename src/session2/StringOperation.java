package session2;

public class StringOperation {

    public static void main(String[] args) {

        String msg = "Hello!";

//        msg=msg+" Mohammad";

        String msg2 = "Hello!";

        boolean isEq = msg == msg2;
        System.out.println("isEq = " + isEq);
        String msg3 = new String("Hello!");
        boolean isMsg3EqToMsg2 = msg3 == msg2;
        System.out.println("isMsg3EqToMsg2 = " + isMsg3EqToMsg2);

        System.out.println("msg3.equals(msg2) = " + msg3.equals(msg2));

        String _msg = "Hello World\u0021";
        System.out.println(_msg);

        String name = "Mohammad";

        String substring = name.substring(0, 3);
        System.out.println("substring = " + substring);

        char c = name.charAt(3);
        System.out.println("c = " + c);

        String javaTxt = "Java\uD83D\uDc31";
        System.out.println("javaTxt = " + javaTxt);

        System.out.println("name.length() = " + name.length());
        System.out.println("javaTxt.length() = " + javaTxt.length());

        long count = javaTxt.codePoints().count();
        System.out.println("count = " + count);

        String toTrim = "    Mohammad   ";
        System.out.println("toTrim = " + toTrim+",");
        System.out.println("toTrim = " + toTrim.trim()+",");

        String longTxt ="dear Mohammad, please call me";
        System.out.println("longTxt.indexOf(\"call\") = " + longTxt.indexOf("call"));

        int i = Integer.parseInt("2");
        System.out.println("i = " + i);
        System.out.println("2" + 2);

//        Integer.parseInt("Mohammad");

        int a = 'a';
    }
}
