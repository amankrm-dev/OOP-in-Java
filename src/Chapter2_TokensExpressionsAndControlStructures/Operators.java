package Chapter2_TokensExpressionsAndControlStructures;

public class Operators {

    public static void main(String[] args) {
//        double a=5.5;
//        double b=2.4;
//        System.out.println(a%b);
        int a = 21, b = -65, c = 23;
        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println("A is second largest :" + a);
        }
        else if ((b > a && b < c) || (b < a && b > c)) {
            System.out.println("B is second largest :" + b);
        }
        else{
            System.out.println("C is second largest:"+c);
        }

    }
}
