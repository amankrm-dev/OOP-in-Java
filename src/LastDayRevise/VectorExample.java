package LastDayRevise;
import java.util.*;
public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector =new Vector<>();
        Random rand=new Random();
        for(int i=0;i<5;i++){
            vector.add(rand.nextInt(100)+1);
        }
        Enumeration<Integer> e=vector.elements();
        System.out.println("Elements in Vector:");
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
