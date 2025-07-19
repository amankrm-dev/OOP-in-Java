package LastDayRevise;

import java.util.Scanner;

class  InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}
public class BankWithdraw {
    public static void main(String[] args) {
        Scanner   sc=new Scanner(System.in);
        int balance=5000;
        System.out.println("Enter the amount you want to withdraw:");
        int withdraw=sc.nextInt();
        try{
            if(withdraw<balance){
                System.out.println("Sucessfully withdrawn amount Rs "+withdraw);
                balance-=withdraw;

            }
            if(withdraw>balance){
                throw new InsufficientBalanceException("Withdraw exceeds Balance amount");
            }
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
