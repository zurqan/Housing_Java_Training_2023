package basic.session5;

public class RectangleArea extends PaintableArea {
    private final double length;
    private final double width;

    public RectangleArea(int color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calculateArea() {
        System.out.printf( "Now Calculating Rectangle area with width %s, length %s\n",width,length);

        return width*length;
    }
}
