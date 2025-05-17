package Chapter8_IOandStreams;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
public class OneShot {
    // public static void main(String[] args)throws Exception {
    //     System.out.println("File handling in JAVA");
    //     File file=new File("abc.txt");
    //     file.createNewFile();
    //     System.out.println(file.exists());
    //     System.out.println(file.canExecute());
    //     FileWriter fw=new FileWriter(file);
    //     // fw.write("Hello this is aman kr.");
    //     // fw.close();
    //     FileReader fr=new FileReader(file);
    //     System.out.println(fr.read());




     public static void main(String[] args)throws Exception {
        System.out.println("File handling in JAVA");
        FileWriter fw=new FileWriter("\\D:\\Java.AK\\hsm.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Hello this is aman kr. Welcome to java master class");
        bw.close();
        FileReader fr=new FileReader("\\D:\\Java.AK\\hsm.txt");
        BufferedReader br=new BufferedReader(fr);
        System.out.println(br.readLine());
    }
}
