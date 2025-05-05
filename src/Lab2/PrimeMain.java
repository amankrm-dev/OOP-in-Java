package Lab2;

import java.util.Scanner;

public class PrimeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        // Check if the number is greater than 1 to consider prime numbers.
        for (int i = 2; i <= n; i++) {
            boolean flag = true; // Assume the number is prime initially
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) { // If divisible, it is not a prime number
                    flag = false;
                    break;
                }
            }
            if (flag) { // If prime, print the number
                System.out.println(i);
            }
        }
    }
}
