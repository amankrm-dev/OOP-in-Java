package Lab2;


import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  // Read the number

        // Initialize a variable to count the digits
        int count = 0;

        // Check if the number is zero, as zero has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            // Loop to count the number of digits
            while (number != 0) {
                number = number / 10;  // Remove the last digit
                count++;               // Increment the count
            }
        }

        // Output the result
        System.out.println("The number of digits is: " + count);

        // Close the scanner
        scanner.close();
    }
}
