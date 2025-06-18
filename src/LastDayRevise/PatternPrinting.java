package LastDayRevise;
// Pattern printing in Java
//public class PatternPrinting {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=0;i<5;i++){
//            for(int j=0;j<n;j++){
//                if(j<i){
//                    System.out.print(" ");
//                } else {
//                    System.out.print(j+1);
//                }
//            }
//            System.out.println(" ");
//        }
//    }
//}


//Using only for loop
public class PatternPrinting {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i + 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
