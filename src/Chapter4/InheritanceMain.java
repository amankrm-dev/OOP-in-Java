package Chapter4;

class vehicle {
   protected int speed;
   protected String color;
    vehicle(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    void display() {
        System.out.println("The speed of the car is " + this.speed + " & The color of the car is " + this.color);
    }

    void accelerate() {
        System.out.println("Accelerated");
    }
}

class car extends vehicle {
    car(int speed ,String color){
//        this.speed=speed;
//        this.color=color;
        super(speed,color);

    }
    void drift() {
        System.out.println("The Car drifted with color " + color);
    }

}

public class InheritanceMain {
    public static void main(String[] args) {
        car c = new car(12,"red");
        c.drift();

    }
}
