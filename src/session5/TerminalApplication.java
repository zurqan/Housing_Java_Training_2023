package session5;

import java.util.Scanner;

public class TerminalApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number Of Paintable Shape: ");
        int sizeOfShapes = scanner.nextInt();
        PaintableArea[] shapes = new PaintableArea[sizeOfShapes];

        int counterOfShapes = 0;
        while (counterOfShapes<sizeOfShapes){

            System.out.println("Enter Shape Type ");
            System.out.println("1 Rectangle");
            System.out.println("2 Circle");
            System.out.print("Shape Type: ");
            int shapeType = scanner.nextInt();
            PaintableArea area = null;

            switch (shapeType){
                case 1:
                    System.out.print("Enter Width: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter Length: ");
                    double length = scanner.nextDouble();
                    area = new RectangleArea(1,length,width);
                    break;
                case 2:
                    System.out.print("Enter Radius: ");
                    int radius = scanner.nextInt();
                    area = new CircleArea(1,radius);
                    break;
                default:
                    System.out.println("Not valid input");
                    continue;
            }
            shapes[counterOfShapes++]=area;
        }

        double totalArea = 0;
        for (PaintableArea shape : shapes) {
            totalArea+=shape.calculateArea();
        }

        System.out.println("totalArea = " + totalArea);
    }
}
