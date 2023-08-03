package advance.session4;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class EnumSetApplication {

    public static void main(String[] args) {

        Set <Color> colors = new HashSet<>();
        colors.add(Color.RED);
        colors.add(Color.RED);
        colors.add(Color.BLUE);
        colors.add(Color.BLACK);
        colors.add(Color.BLACK);
        colors.add(Color.BLUE);

        System.out.println("colors = " + colors);


        EnumSet <Color> colorsSet = EnumSet.of(
                Color.RED,
                Color.RED,
                Color.BLUE,
                Color.BLACK,
                Color.BLUE
        );



        System.out.println("colorsSet = " + colorsSet);

    }


    public static enum Color{

        RED,
        YELLOW,
        BLUE,
        WHITE,
        BLACK;
    }
}
