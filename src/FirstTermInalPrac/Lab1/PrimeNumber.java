package FirstTermInalPrac.Lab1;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        n=sc.nextInt();
        sc.close();
        if (n <= 1) {
            System.out.println("Not prime");
            return;
        }
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+" is Prime");
        }
        else {
            System.out.println(n+" is Not prime");
        }
    }
}
