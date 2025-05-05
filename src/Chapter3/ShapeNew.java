package Chapter3;

class Rectangle {

    double length, breadth;

    double CalculateArea() {
        return length * breadth;
    }
}

public class ShapeNew {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();  // this is using refeerence variable 
        Rectangle r2 = new Rectangle();
        r1.length = 3;
        r1.breadth = 4;
        r2.length = 10;
        r2.breadth = 6;
        System.out.println("The area is :"+r1.CalculateArea());
        System.out.println("The area is :"+r2.CalculateArea());

    }
}
