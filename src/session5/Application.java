package session5;

public class Application {

    public static void main(String[] args) {

        PaintableArea[] areas= {new CircleArea(1,2)
                ,new RectangleArea(3,4,6)
                ,new CircleArea(1,9)};

        double totalArea = 0;
        for (PaintableArea area : areas) {

            totalArea+= area.calculateArea();
        }

        System.out.println("totalArea = " + totalArea);
    }
}
