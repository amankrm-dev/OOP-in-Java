package Lab6;

import java.util.Scanner;

public class LogicAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int sum=0;
        System.out.println("Enter any 5 multidigit numbers:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%10==1){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
