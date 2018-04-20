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
        Square square = new Square("square", 2);

        List<Shape> Shapes =new ArrayList<>();
        Shapes.add(circle);
        Shapes.add(triangle);
        Shapes.add(rectangle);
        Shapes.add(square);

        for(Shape sp: Shapes){
        sp.description();
        }

    }

    public static void main(String[] args){

        inheritance();

    }

}
