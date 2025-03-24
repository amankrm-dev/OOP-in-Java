package FirstTermInalPrac.Lab1;

import java.util.Scanner;

public class SumOfFirstN_EvenAndOdd {
    public static void main(String[] args) {
        System.out.println("Enter the nth term:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int even=0,odd=0;
        for(int i=1;i<=n;i++){
            if(i%2==0)
            {
                even+=i;
            }
            else {
                odd+=i;
            }

        }
        System.out.println("Even numbers sum="+even+ " and odd numbers sum = "+odd);
    }
}
