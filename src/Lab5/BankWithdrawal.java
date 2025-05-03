package Lab5;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        System.out.print("Enter amount to withdraw: ");
        int withdraw = sc.nextInt();

        try {
            if (withdraw > balance) {
                throw new InsufficientBalanceException("Withdrawal amount exceeds available balance.");
            } else {
                balance -= withdraw;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}