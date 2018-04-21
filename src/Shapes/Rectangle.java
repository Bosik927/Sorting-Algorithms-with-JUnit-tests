package Shapes;

public class Rectangle extends Shape {

    protected double length, height;

    public Rectangle(String name, double len, double hei) {
        super(name);
        length = len;
        height = hei;
    }

    @Override
    public double calculateArea() {
        return Math.rint(length * height);
    }

    @Override
    public double calculatePerimeter() {
        return Math.rint((length + height) * 2);
    }

    @Override
    public void description() {
        System.out.println("Object-Rectangle, Name-" + getName() + " area-" + calculateArea() + " perimeter-" + calculatePerimeter());

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("I\'m Rectanle my name is ").append(getName()).append("\n");
        return sb.toString();
    }
}
