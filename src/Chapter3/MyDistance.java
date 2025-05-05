
package Chapter3;

class Distance {

    int inch, feet;

    Distance(int feet, int inch) {
        this.inch = inch;
        this.feet = feet;
    }

    Distance Add_Distance(Distance temp) {
        int final_feet = this.feet + temp.feet;
        int final_inch = this.inch + temp.inch;

        if (final_inch >= 12) {
            final_feet = final_feet + (final_inch / 12);
            final_inch = final_inch % 12;
        }

        return new Distance(final_feet, final_inch);
    }

    Distance Subtract_Distance(Distance temp) {
        int final_feet = this.feet - temp.feet;
        int final_inch = this.inch - temp.inch;

        if (final_inch < 0) {
            final_inch = final_inch + 12;
            final_feet = final_feet - 1;
        }

        return new Distance(final_feet, final_inch);
    }

    void Display_Distance() {
        System.out.println("The total distance is: " + this.feet + " Feet " + this.inch + " Inches");
    }
}

public class MyDistance {

    public static void main(String[] args) {
        Distance d1 = new Distance(12, 11);
        Distance d2 = new Distance(6, 11);
        
        Distance t = d1.Add_Distance(d2);
        System.out.println("Sum of distance:");
        t.Display_Distance();
        
        Distance j = d1.Subtract_Distance(d2);
        System.out.println("Difference of distance:");
        j.Display_Distance();
    }
}

