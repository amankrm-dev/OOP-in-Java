package LastDayRevise;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapped numbers are a="+a+"and  b="+b);
    }

}
