package LastDayRevise;
import  java.util.*;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        Random rand=new Random();
        for(int i=0;i<5;i++){
            stack.push(rand.nextInt(41)+10);
        }
        Enumeration<Integer> e=stack.elements();
        System.out.println("The number in stack are:");
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
