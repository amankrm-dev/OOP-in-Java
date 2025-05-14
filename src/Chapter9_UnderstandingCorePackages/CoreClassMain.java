package Chapter9_UnderstandingCorePackages;

import java.util.Scanner;

public class CoreClassMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        String num=sc.next();
        Double num1=Double.valueOf(num);
        System.out.println(num);
    }
}
