package LastDayRevise;

import java.io.*;

public class MyClass {
    public static void main(String[] args) throws Exception {
//        File file=new File("myfile.txt");
//        file.createNewFile();
//        System.out.println(file.exists());
//        FileWriter fw=new FileWriter(file);
//        fw.write("Hello What's up man !");
//        fw.close();
//        FileReader fr=new FileReader(file);
//        System.out.println(fr.read());
//
        FileWriter fw=new FileWriter("abc.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Hey this is master class");
        bw.close();
        FileReader fr=new FileReader("abc.txt");
        BufferedReader br=new BufferedReader(fr);
        System.out.println(br.readLine());
    }


}
