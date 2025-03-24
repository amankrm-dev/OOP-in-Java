package FirstTermInalPrac;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,8,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any element to search:");
        int key=sc.nextInt();
        boolean found=false;
        for(int num:arr){
            if(key==num){
                found=true;
                break;
            }
        }
        if (found){
            System.out.println("Element "+key+" found !");
        }
        else {
            System.out.println("not found");
        }
        sc.close();
    }
}
