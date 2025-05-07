package Chapter8_IOandStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyExample {

    public static void main(String[] args) throws IOException {
        String path = "D:\\Java.AK";
        FileWriter fw = null;
        FileReader fr = null;
        try {
            fr = new FileReader(path + "\\text.txt");
            fw = new FileWriter(path + "\\hsm.txt");
            BufferedReader br=new BufferedReader(fr);
            String t;
            while ((t = br.readLine()) !=null) {
                fw.write(t);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            if (fw != null && fr != null) {

                fw.flush();
                fw.close();
                fr.close();
            }
        }
    }
}
