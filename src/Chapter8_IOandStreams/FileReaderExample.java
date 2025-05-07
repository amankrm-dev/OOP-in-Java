package Chapter8_IOandStreams;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileReaderExample {

    public static void main(String[] args) throws IOException {
        String path = ("D:\\Java.AK");
        FileReader fr=null;
        try {
            fr=new FileReader(path+"\\text.txt");
            int t;
            while((t=fr.read())!=-1){
            System.out.print((char)t);
        }
        } catch (IOException ex) {
            Logger.getLogger(FileReaderExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(fr!=null){
                fr.close();
            }
        }
        
        
    }

}
