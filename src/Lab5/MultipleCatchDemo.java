package Lab5;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // ArithmeticException
            int[] arr = new int[3];
            arr[5] = 50; // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        }
    }
}