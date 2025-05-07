package Chapter8_IOandStreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferBinaryFIle {

    public static void main(String[] args) {
        String path = "D:\\Java.AK";
        try (
                BufferedInputStream br = new BufferedInputStream(new FileInputStream(path + "\\new.txt")); BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(path + "\\one.txt"));) {
            byte[] buffer = new byte[8192];
            int bytesRead;
            while ((bytesRead = br.read(buffer)) != -1) {
                bw.write(buffer, 0, bytesRead);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
