package Chapter3_OOPConcepts;

class Car {

    private double distance, time;

    //Constructor to initialize fields
    public Car(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }

    public double getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }

    void calculateSpeed() {
        System.out.println("Speed is " + distance / time);
    }
}

public class CarMain {

    public static void main(String[] args) {
        Car c1 = new Car(12.5, 20.5);
        System.out.println("Distance is " + c1.getDistance());
        System.out.println("Time is " + c1.getTime());
        c1.calculateSpeed();
    }

}
