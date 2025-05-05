package Chapter3;

public class FactorialRecursive {

    static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
//        FactorialRecursive f = new FactorialRecursive();
        System.out.println(FactorialRecursive.factorial(5));

    }
}
