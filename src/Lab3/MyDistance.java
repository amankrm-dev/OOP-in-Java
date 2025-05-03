package Lab3;

class Distance {
    private int feet, inches;

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public Distance addDistance(Distance d) {
        int totalInches = (this.feet + d.feet) * 12 + this.inches + d.inches;
        return new Distance(totalInches / 12, totalInches % 12);
    }

    public Distance subtractDistance(Distance d) {
        int totalInches1 = this.feet * 12 + this.inches;
        int totalInches2 = d.feet * 12 + d.inches;
        int diff = Math.abs(totalInches1 - totalInches2);
        return new Distance(diff / 12, diff % 12);
    }

    public void displayDistance() {
        System.out.println(feet + " feet " + inches + " inches");
    }
}

public class MyDistance {
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 8);
        Distance d2 = new Distance(3, 10);

        Distance sum = d1.addDistance(d2);
        Distance diff = d1.subtractDistance(d2);

        System.out.print("Sum: ");
        sum.displayDistance();
        System.out.print("Difference: ");
        diff.displayDistance();
    }
}