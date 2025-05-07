package Chapter5_HandlingErrorsAndExceptions;

public class TryCatch {
    public static void main(String[] args) {
        int i=9;
        try{
          
          System.out.println(i);
      }
//      catch(RuntimeException ex){
//          System.out.println("RuntimeException");
//      }
        finally{
            System.out.println("Aur aagaya swaad");
        }
    }
}
