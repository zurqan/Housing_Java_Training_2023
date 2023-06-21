package session5;

public abstract class PaintableArea {


    private final int color;//1 red ; 2 blue ; 3 yellow

    protected PaintableArea(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public abstract double calculateArea();
}
