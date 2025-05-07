package Chapter6_HandlingStrings;

import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] color= new String[5];
        System.out.println("Enter the choice of your colors :");
        //input part
        for(int i=0;i<color.length;i++){
            color[i]=sc.next();
        }
        //sorting algorithm
        for(int i=0;i<color.length-1;i++){
            for(int j=0;j<color.length-i-1;j++){
                if(color[j].compareTo(color[j+1])>0){
                    String t=color[j];
                    color[j]=color[i];
                    color[i]=t;
                }
            }
        }
        System.out.println("Sorted List of Colours: ");
        for(String i:color){
            System.out.println(i);
        }
    }
}
