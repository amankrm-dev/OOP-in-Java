//Check if user entered character is alphabet,number or symbol
package LastDayRevise;
import java.util.Scanner;
public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
            System.out.println("You entered an alphabet.");
        } else if(ch>='0' && ch<='9') {
            System.out.println("You entered a number.");
        } else {
            System.out.println("You entered a symbol.");
        }

    }
}
