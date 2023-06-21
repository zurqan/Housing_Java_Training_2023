package session5;

public class CircleArea extends PaintableArea{

    private final int radius ;

    public CircleArea(int color ,int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        System.out.printf( "Now Calculating Circle area with radius %s\n",radius);
        return Math.PI*radius*radius;
    }
}
