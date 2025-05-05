package Chapter3;

class Addition {

    int add(int a, int b) {
//             System.out.println("The sum of Integers is:"+ (a+b));
        return a + b;
    }

    void add(double a, double b, double c) {
        System.out.println("THe Sum of Decimal numbers is :" + (a + b + c));
    }
}

public class AdditionMain {

    public static void main(String[] args) {
        Addition Integers = new Addition();
        Addition Decimals = new Addition();
//        Integers.add(5, 6);
        System.out.println("The sum of Integers is:" + Integers.add(3, 5));
        Decimals.add(3, 5, 4.4);

    }
}
