package Chapter8_IOandStreams;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Chapter8 {

    public static void main(String[] args) {
        String path = ("D:\\Java.AK");
//        File f = new File(path + "\\hsm\\hetauda\\college");
        File f=new File(path + "\\hsm\\hetauda\\college\\text.txt");
        try {
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Chapter8.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.exists());
        System.out.println(f.isDirectory());
        System.out.println(f.length());
        System.out.println(f.isFile());
//        System.out.println(f.delete());
//        f.mkdirs();
        f.mkdir();

    }

}
