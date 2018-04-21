package Shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeContainer {

    protected List<Shape> shapes;

    public ShapeContainer() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void display() {
        boolean counter = true;
        for (Shape shape : shapes) {
            shape.description();
            counter = false;
        }
        if (counter) {
            System.out.println("Container is empty.");
        }

    }

    public void display(String name) {
        boolean counter = false;
        for (Shape shape : shapes) {
            if (shape.getName() == name) {
                shape.description();
                counter = true;
            }
        }

        if (!counter) {
            System.out.println("Error didnt find shape with name " + name);
        }

    }

    public int size() {
        return shapes.size();
    }
}
