package Chapter3;

class Rectangles {

    double length, breadth;

    Rectangles(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double CalculateArea() {
        return length * breadth;
    }
}

public class UsingConstructor {

    public static void main(String[] args) {
        Rectangles r1 = new Rectangles(3, 4);

        System.out.println("The Area is :" + r1.CalculateArea());

    }
}
