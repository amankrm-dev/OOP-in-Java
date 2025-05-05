package Chapter3;
 
class Shapes{
    void area(int l,int b){
        System.out.println("The Area of Rectangle is :"+ l*b);
}
     void area(int l){
         System.out.println("THe Area of Square is : "+ l*l);
}
}
public class MethodOverloading {
    public static void main(String[] args) {
        Shapes rectangle=new Shapes();
        Shapes square=new Shapes();
        rectangle.area(3,5);
        square.area(5);

    }
}
