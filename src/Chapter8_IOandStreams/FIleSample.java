package Chapter8_IOandStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIleSample {

    public static void main(String[] args) throws IOException {
        String path = "D:\\Java.AK";

//        FileWriter fw = null;
//        BufferedWriter bw=null;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\bca.txt"))) {

//            fw = new FileWriter(path + "\\bca.txt");
//            bw=new BufferedWriter(fw);
            for (int i = 10; i <= 50; i++) {
                bw.write(i + "\n");
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(path + "\\bca.txt"))) {
            String c;
            while ((c = br.readLine()) != null) {
               if(Integer.valueOf(c)%2==0){
                    System.out.println(c);
               }
            }
        }

//          finally {
//            if (bw != null) {
////                fw.flush();
////                fw.close();
//                bw.close();
//            }
    }
}
