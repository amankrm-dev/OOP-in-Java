package Chapter3;

public class Shape {

    double length, breadth;

    void CalculateArea() {
        System.out.println("The area is :" + length * breadth);
    }

    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape();
        Shape s3 = new Shape();
        s1.length = 2;
        s2.length = 3;
        s3.length = 8;
        s1.breadth = 2;
        s2.breadth = 3;
        s3.breadth = 8;
        s1.CalculateArea();
        s2.CalculateArea();
        s3.CalculateArea();

    }

}
