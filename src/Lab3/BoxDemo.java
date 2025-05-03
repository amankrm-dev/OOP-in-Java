package Lab3;

class Box {
    private double length, breadth;

    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double area() {
        return length * breadth;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box(10, 5);
        Box box2 = new Box(7, 6);

        double area1 = box1.area();
        double area2 = box2.area();

        System.out.println("Largest Area: " + Math.max(area1, area2));
    }
}
