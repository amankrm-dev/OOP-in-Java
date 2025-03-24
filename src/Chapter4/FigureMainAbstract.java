package Chapter4;

abstract class Figure {

    int dim1, dim2;

    Figure(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void area();
}

class Rectangle extends Figure {

    Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    void area() {
        double area = dim1 * dim2;
        double FinalArea = super.dim1 * super.dim2;
        System.out.println("Rectangle Area:" + FinalArea);
    }
}

class Square extends Figure {

    Square(int dim1) {
        super(dim1, dim1);
    }

    void area() {
        double FinalArea = dim1 * dim1;
        System.out.println("Square Area:" + FinalArea);
    }
}

public class FigureMainAbstract {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(3, 4);
        Square s = new Square(3);
        r.area();
        s.area();

    }
}
