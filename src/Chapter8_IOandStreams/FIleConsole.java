package Chapter8_IOandStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FIleConsole {
    public static void main(String[] args) throws IOException {
        String name;
        int age;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        name=sc.nextLine();
//        System.out.println("Enter your age: ");
//        age=sc.nextInt();
//        System.out.println("Name is "+name+" and age is "+age);
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
           
        System.out.println("Enter your name: ");
        name=br.readLine();
        System.out.println("Enter your age: ");
        age=Integer.valueOf(br.readLine());
        System.out.println("Name is "+name+" and age is "+age);
        }
        catch(IOException ex){
            System.out.println(ex);
        }
    }
}
