package Chapter7;

class ExampleThreads extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
        System.out.println(i);
        }  }
}
public class ThreadsNew {

   
    public static void main(String[] args) {
       ExampleThreads s = new ExampleThreads();
       s.run();
    }
    
}
