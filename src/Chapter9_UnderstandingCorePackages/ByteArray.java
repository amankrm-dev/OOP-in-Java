package Chapter9_UnderstandingCorePackages;


import java.util.Random;

public class ByteArray {
        public static void main(String[] args) {
        byte[] bytes=new byte[10];
        Random random=new Random();
        random.nextBytes(bytes);
            System.out.println("Random byte array:");
            for(byte b:bytes){
                System.out.println(b+" ");
            }
    }
}
