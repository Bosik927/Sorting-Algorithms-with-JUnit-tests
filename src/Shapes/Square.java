package Shapes;

public class Square extends Rectangle {
    public Square(String name, double len) {
        super(name, len, len);
    }

    @Override
    public double calculateArea() {
        return super.calculateArea();
    }

    @Override
    public double calculatePerimeter() {
        return super.calculatePerimeter();
    }

    @Override
    public void description() {
        System.out.println("Object-Square, Name-"+getName()+" area-"+calculateArea()+" perimeter-"+calculatePerimeter());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("I\'m Square my name is ").append(getName()).append("\n");
        return sb.toString();
    }
}
