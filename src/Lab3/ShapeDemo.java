package Lab3;

class Shape{
    int l,b;
    double area(int l,int b){
        return l*b;
    }
    double area(int l){
        return l*l;
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Shape s=new Shape();
        System.out.println("Area of Rectangle:"+s.area(3,5));
        System.out.println("Area of Square :"+s.area(3));
    }
}
