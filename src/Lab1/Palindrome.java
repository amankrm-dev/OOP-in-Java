package Lab1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int n=sc.nextInt();
        sc.close();
        int original_num=n;
        int rev=0;
        while (n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;

        }
        if(original_num==rev){
            System.out.println("It is palindrome number:"+rev);
        }
        else {
            System.out.println("Not palindrome :"+rev);
        }

    }
}
