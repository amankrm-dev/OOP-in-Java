package Lab5;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

        try {
            String number = "abc";
            int num = Integer.parseInt(number); // NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}