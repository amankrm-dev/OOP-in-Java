package Chapter3;

class Shape2 {

    int length, breadth;

//Constructor for Rectangle
    Shape2(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }
//constructor for square

    Shape2(int length) {
        this.length = length;
        this.breadth = length;
    }

    int area() { //for REctangle
        // System.out.println("THe area of REctangle is :" + length * breadth);
        return length * breadth;

    }

    void areaS() {//for Square
        System.out.println("The area of Square is:" + length * length);
    }
    int perim(){ 
        return 2*(length+breadth);
    }
    
}

public class ShapeConstructor {

    public static void main(String[] args) {
        Shape2 rectangle = new Shape2(4, 5);
        Shape2 square = new Shape2(5);
        Shape2 perimeter= new Shape2(3, 4);
        
        // rectangle.areaR();
        System.out.println("THe area of REctangle is :" + rectangle.area());
//        Square.areaS();
        System.out.println("The area of Square is:" + square.area());
        System.out.println("The Perimeter of REctangle is :"+ perimeter.perim());
    }
}

