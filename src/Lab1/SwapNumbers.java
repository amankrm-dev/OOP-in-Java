package Lab1;

import org.w3c.dom.ls.LSOutput;

public class SwapNumbers {
    public static void main(String[] args){
        int a=4;
        int b=7;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+" and b="+b);
    }

}
