package Chapter2_TokensExpressionsAndControlStructures;

import java.util.Scanner;


public class EnhancedSwitch {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int EventCode;
        System.out.println("Enter any event code from : 101, 102, 103, / 201, 202, 203, / 301, 302, 303 ");
        EventCode= sc.nextInt();
        int priorityLevel=switch(EventCode){
            case 101, 102, 103 -> 1;
            case 201, 202, 203 -> 2;
            case 301, 302, 303 -> 3;
            default -> 0;
        };
        System.out.println("The Priority level is " +priorityLevel+ " and the EventCode is "+EventCode);
                
    }
}
