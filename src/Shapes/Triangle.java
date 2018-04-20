package Shapes;

public class Triangle extends Shape {

    double firstSide, secondSide, thirdSide;

    public Triangle(String name,double first, double second, double third) {
        super(name);
        firstSide = first;
        secondSide=second;
        thirdSide = third;
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = (calculatePerimeter()/2);

        return Math.rint(Math.sqrt(halfPerimeter*(halfPerimeter-firstSide)*(halfPerimeter-secondSide)*(halfPerimeter-thirdSide)));
    }

    @Override
    public double calculatePerimeter() {
        return Math.rint(firstSide+secondSide+thirdSide);
    }

    @Override
    public void description() {
        System.out.println("Object-Triangle, Name-"+getName()+" area-"+calculateArea()+" perimeter-"+calculatePerimeter());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("I\'m Triangle my name is ").append(getName()).append("\n");
        return sb.toString();
    }
}
