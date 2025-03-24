class Car{
    String brand;
    int speed;
    void display(){
        System.out.println(brand+" brand "+speed+" Speed");
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.brand="Porsche";
        c1.speed=300;
        c1.display();
    }
}
