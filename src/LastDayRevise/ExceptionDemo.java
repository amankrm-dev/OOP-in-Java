package LastDayRevise;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        try{
            String number="abcd";
            int num=Integer.parseInt(number);

        }
        catch (NumberFormatException e){
            System.out.println("Number Format Exception Caught "+e.getMessage());
        }
    }
}