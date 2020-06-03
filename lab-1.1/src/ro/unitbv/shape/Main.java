package ro.unitbv.shape;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shape = new ArrayList<>();
        shape.add(new Patrat("#a09542", 5, 6));
        shape.add(new Dreptunghi("#f8f5f8", 4, 10, 12));
        shape.add(new Cerc("#f9f5f9", 2, 4));

        for (Shape s : shape) {

            System.out.println("Name of the shape: ");
            System.out.println(s.getName());

            System.out.println("Area of the shape: ");
            System.out.println(s.getArea());

            System.out.println("Border width: ");
            System.out.println(s.getBorderWidth());

            System.out.println("Hex color: ");
            System.out.println(s.getHexFillColor());

            System.out.println();
            s.draw();
            System.out.println();

        }

    }

}