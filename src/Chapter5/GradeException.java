package Chapter5;

import java.util.Scanner;

class GradeOutOfRangeException extends Exception {

    public GradeOutOfRangeException(String msg) {
        super(msg);
    }
}

public class GradeException {

    int grade;

    public GradeException(int grade) {
        this.grade = grade;
    }

    void checkGrade() {
        try {
            if (this.grade < 0 || this.grade > 100) {
                throw new GradeOutOfRangeException("Number range is invalid");
            }
            System.out.println("Your Grade is:" + this.grade);
        } catch (GradeOutOfRangeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade");
        int grade = input.nextInt();
        GradeException person = new GradeException(grade);
        person.checkGrade();
    }

}

/* Documentation for User-Defined Exception in Java

Overview
A user-defined exception is a custom exception created by extending the Exception class. It is useful when predefined exceptions do not fit specific application needs.

Explanation of GradeException Class
In this program, a custom exception (GradeOutOfRangeException) is used to ensure the entered grade is within the valid range (0-100). The program prompts the user to enter a grade and validates it.
If the grade is less than 0 or greater than 100, a GradeOutOfRangeException is thrown.
A try-catch block captures the exception and displays an error message.
If the grade is within range, it is displayed as valid.

Key Steps:
The program asks the user to enter a grade.
It checks if the grade is outside the valid range.
If the grade is invalid, an exception is thrown.
The exception is caught and an appropriate message is shown.

 */