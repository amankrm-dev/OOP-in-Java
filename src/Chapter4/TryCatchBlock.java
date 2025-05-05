package Chapter4;

public class TryCatchBlock {
    public static void main(String[] args) {
        try{
            int[] a={12,33,43,6,4};
            double div=a[3]/0;
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("TADA!"); 
        }
    }
}
