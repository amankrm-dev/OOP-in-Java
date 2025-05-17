package Chapter9_UnderstandingCorePackages;

import java.util.Scanner;

public class HigherORLowerGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min=1,max=50;
        double answer=Math.round(Math.random()*(max-min+1)+min);
        int life=10;
        while(life!=0){
            
            System.out.println("Enter any integer number from 1 to 30");
        double user_input=sc.nextInt();
        if(user_input==answer){
            System.out.println("You Won The guessed number is correct: "+user_input);
            return;
        }else{
            if(user_input<answer){
                System.out.println("Guess Higher.");
            }else{
                System.out.println("Guess Lower");
            }
        }
        life--;
            System.out.println("You have "+life+"/10 Chance Left");
        }
        if(life==0){
            System.out.println("You Lose! THe correct number was: "+answer);

        }
        
    }
}
