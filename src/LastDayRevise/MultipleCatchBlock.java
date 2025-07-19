package LastDayRevise;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try{
            int a=10/0;
            int[] arr=new int[3];
            arr[5]=50;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
