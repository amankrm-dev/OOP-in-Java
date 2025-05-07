package Chapter8_IOandStreams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) throws IOException {
        String path = "D:\\Java.AK";
        FileWriter fw = null;
        try {
            fw = new FileWriter(path + "\\text.txt", true);
            fw.write("Hello Riyaz bhai what are you doing");
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            if (fw != null) {
                fw.flush();
                fw.close();
            }
        }

    }

}
