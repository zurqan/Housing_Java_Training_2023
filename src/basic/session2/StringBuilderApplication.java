package basic.session2;

public class StringBuilderApplication {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Hello");
        String msg = stringBuilder.append(" ")
                .append("Mohammad")
                .append(",ID :")
                .append(1234).toString();

        System.out.println(msg);

        msg.chars().forEach(System.out::println);//Functional Interface
        String[] s = msg.split(" ");//Array



    }
}
