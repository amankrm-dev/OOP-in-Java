package Chapter5_HandlingErrorsAndExceptions;

import java.util.Scanner;

class NotEligibleException extends Exception{

    public NotEligibleException(String msg) {
        super(msg);
    }

}
public class VoterList {
    int age;
    VoterList(int age){
        this.age=age;
    }
    void checkEligibility(){
        try{
            if(age<18){
                throw new NotEligibleException("Error: There is a minimum age restriction to vote");
            }
            System.out.println("Congrats you are eligible to vote!");
        }
        catch(NotEligibleException nee){
            System.out.println(nee.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age in years");
        int age=input.nextInt();
        VoterList person=new VoterList(age);
        person.checkEligibility();
    }

}


/* Documentation for throw in Java

Overview
The throw keyword in Java is used to explicitly generate an exception when a specific condition is met. It allows for better control of error handling by enforcing custom rules within the program.

Explanation of VoterList Class
In this program, a custom exception (NotEligibleException) is created to handle voting eligibility. The program asks the user for their age and checks if they are eligible to vote.
If the age is less than 18, the program throws a NotEligibleException with a specific error message.
The try-catch block ensures that the program does not crash but instead displays an appropriate message.
If the user is eligible, a success message is displayed.

Key Steps:
The program takes user input for age.
It checks if the age is below 18.
If true, an exception is thrown.
The exception is caught and handled gracefully by displaying the message. */