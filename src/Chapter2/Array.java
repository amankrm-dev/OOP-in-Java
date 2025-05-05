package Chapter2;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
//        int[] arr= new int[5];
//        arr[0]=1;
//        arr[1]=12;
//        arr[2]=31;
//        arr[3]=14;
//        arr[4]=143; 
//        for(int i=0;i<5;i++)
//        {
//            System.out.printf("a[%d]=%d\n",i,arr[i]);
//        }
        int[][] arr = new int[3][3];
        int sum=0;
        int sums=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The values of Matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is Here");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d \t", arr[i][j]);
            }
            System.out.println("");

        }
        for (int i = 0; i < 3; i++) {
            sum = sum + arr[i][i];
        }
        System.out.println("The sum of primary diagonal is ="+sum);
        
         for (int i = 0; i < 3; i++) {
            sums = sums + arr[i][3-i-1];
        }
         System.out.println("The sum of secondary diagonal is ="+sums);
    }

}
