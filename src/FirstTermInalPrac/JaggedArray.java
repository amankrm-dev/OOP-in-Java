package FirstTermInalPrac;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] jagged = new int[3][];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        jagged[0] = new int[3];
        jagged[1] = new int[2];
        jagged[2] = new int[4];
        System.out.println("Enter the Elements of Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = sc.nextInt();
                sum += jagged[i][j];
            }
        }
        System.out.println("Jagged array:");
        for (int[] rows : jagged) {
            for (int num : rows) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of all the elemets of array is :" + sum);
        sc.close();
    }
}
