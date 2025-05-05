package Chapter3;

class Rectangless {

    double length, breadth;

    void get_input(double x, double y) {
        length = x;
        breadth = y;
    }

    double CalculateArea() {
        return length * breadth;
    }
}

public class UsingReferenceVariable {

    public static void main(String[] args) {
        Rectangless r1 = new Rectangless();
        r1.get_input(3, 4);
        System.out.println("The Area is :" + r1.CalculateArea());

    }
}
