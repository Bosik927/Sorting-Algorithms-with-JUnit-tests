package Shapes;

abstract public class Shape {

    static protected int counter = 0;
    protected int ID;
    protected String name;

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(String name) {
        this.name = name;
        counter++;
        ID = counter;
    }

    abstract public double calculateArea();

    abstract public double calculatePerimeter();

    public void description() {
        System.out.println("Object-Shapes. ID-" + getID() + "Name-" + getName() + " area-" + calculateArea() + " perimeter-" + calculatePerimeter());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("I\'m Shapes.Shape my name is ").append(getName()).append(" my ID is ").append(getID()).append("\n");
        return sb.toString();
    }
}
