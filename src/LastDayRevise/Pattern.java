package LastDayRevise;

public class Pattern {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<5;j++){
                System.out.print(" 1");
            }
            System.out.println();
        }
    }
}
