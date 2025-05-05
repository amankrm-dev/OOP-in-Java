package Chapter7;

import java.util.logging.Level;
import java.util.logging.Logger;


class EvenThreads extends Thread{
    @Override
   public void run(){
       for(int i=100;i<=200;i++){
           try {
               if(i%2==0)
                   System.out.println(Thread.currentThread().getName()+" : "+i);
               Thread.sleep(55);
           } catch (InterruptedException ex) {
               Logger.getLogger(EvenThread.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
}
class OddThreads extends Thread{
    @Override
   public void run(){
        
       for(int i=100;i<=200;i++){
           if(i%2!=0)
            System.out.println(Thread.currentThread().getName()+" : "+i);
       }
    }
}
public class ThreadPrac {
    public static void main(String[] args) {
        EvenThreads e=new EvenThreads();
        OddThreads o=new OddThreads();
        e.setName("Even");
        try {
            e.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadPrac.class.getName()).log(Level.SEVERE, null, ex);
        }
        o.setName("Odd");
        e.start();
        o.start();
       
    }
}
