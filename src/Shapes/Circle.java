package Shapes;

public class Circle extends Shape {

    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.rint(2*Math.PI*radius);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("I\'m Circle my name is ").append(getName()).append("\n");
        return sb.toString();
    }
    @Override
    public double calculateArea() {
        return Math.rint(Math.PI * radius *radius);
    }

    @Override
    public void description() {
        System.out.println("Object-Circle, Name-"+getName()+" area-"+calculateArea()+" perimeter-"+calculatePerimeter());
    }
}
