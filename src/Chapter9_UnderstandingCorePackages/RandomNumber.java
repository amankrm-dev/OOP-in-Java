package Chapter9_UnderstandingCorePackages;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random=new Random();
        int randomInt=random.nextInt(0,12);
        Double randomInt1=random.nextDouble(0,100);
        Boolean randomInt2=random.nextBoolean();
        System.out.println("Random integer is :"+randomInt);
        System.out.println("Random Float is :"+randomInt1);
        System.out.println("Random integer is :"+randomInt2);
    }
}
