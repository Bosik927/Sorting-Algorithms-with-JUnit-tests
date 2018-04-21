import Shapes.*;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void inheritance(){

        // abstract class
        //Shape sp = new Shape("ss");
        Circle circle = new Circle("Circle", 3);
        Triangle triangle = new Triangle("Triangle",1,2,3);
        Rectangle rectangle = new Rectangle("Rectangle",3,3);
        Square square = new Square("Square", 2);
        ShapeContainer shapes = new ShapeContainer();

        shapes.addShape(circle);
        shapes.addShape(triangle);
        shapes.addShape(rectangle);
        shapes.addShape(square);

        shapes.display();
        System.out.print("\n");
        shapes.display("Square");
        shapes.display("ss");
    }

    public static void main(String[] args){

        inheritance();

    }

}
