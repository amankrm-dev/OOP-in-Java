package Chapter7_Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

class BankAccount {

    int balance = 1000;

    synchronized void withdraw(String name, int amount) {

        if (balance >= amount) {
            try {
                Thread.sleep(600);
            } catch (InterruptedException ex) {
                Logger.getLogger(BankAccount.class.getName()).log(Level.SEVERE, null, ex);
            }
            balance -= amount;
            System.out.println(name + " has withdrawn " + amount);
            System.out.println(name + " has balance" + balance);
        } else {
            System.out.println("Insufficient Balance! Your current balance is :" + balance);
            System.out.println("Waiting.....");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(BankAccount.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    synchronized void deposit(String name,int amount){
        System.out.println(name+" is depositing:"+amount);
        balance+=amount;
        System.out.println("Balance after deposit:"+balance);
        notify();
    }
}

class Person extends Thread {

    int amount;
    String name;
    BankAccount ba;
    boolean isWithdraw;

    Person(BankAccount ba, int amount, String name,boolean isWithdraw) {
        this.ba = ba;
        this.amount = amount;
        this.name = name;
        this.isWithdraw=isWithdraw;
    }

    @Override
    public void run() {
            if(isWithdraw) ba.withdraw(this.name, this.amount);
            else ba.deposit(name,amount);
            
    }
}

public class ThreadSample {

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        Person p1 = new Person(b, 500, "RAM",true);
        Person p2 = new Person(b, 600, "Hari",true);
        Person p3=new Person(b,100,"Shyam",false);
        p1.start();
        p2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadSample.class.getName()).log(Level.SEVERE, null, ex);
        }
        p3.start();
     

    }
}
