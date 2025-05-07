package Chapter5_HandlingErrorsAndExceptions;

import java.util.Scanner;

public class ThrowDemo {
    public static void checkName(String name){
        int l=name.length();
        if(l<5){
            throw new IllegalArgumentException("Name length is smaller than 5");
        }
        System.out.println("Name is Valid:"+name); 
        }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name=sc.nextLine();
        try{
            checkName(name);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
     
    }
}
