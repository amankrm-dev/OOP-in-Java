package LastDayRevise;

import java.io.*;

public class EvenNumberCopy {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("number.txt"));
        for(int i=1;i<=10;i++){
            bw.write(i+"\n");
        }
        bw.close();
        BufferedReader br=new BufferedReader(new FileReader("number.txt"));
        BufferedWriter even=new BufferedWriter(new FileWriter("even.txt"));
        String line;
        while((line=br.readLine())!=null){
            int num=Integer.parseInt(line);
            if(num%2==0){
                even.write(num+"\n");
            }
        }
        br.close();
        even.close();
        System.out.println("Even numbers copied to thhe file ");
    }
}
