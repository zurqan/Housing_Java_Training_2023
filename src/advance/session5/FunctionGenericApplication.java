package advance.session5;

import java.util.function.Function;

public class FunctionGenericApplication {


    public static void main(String[] args) {

        Function<String,Integer> lengthOfStr=str->str.length();

        Function<Integer,Integer> multBy2= x->x*2;

        Function<String, Integer> compose = multBy2.compose(lengthOfStr);

        System.out.println("compose.apply(\"Mohammad\") = " + compose.apply("Mohammad"));
    }
}
