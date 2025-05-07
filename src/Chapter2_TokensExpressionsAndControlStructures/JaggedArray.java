package Chapter2_TokensExpressionsAndControlStructures;


public class JaggedArray {

    public static void main(String[] args) {
        int[][] jaggedArray = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        int sum=0;
        //Displaying Jagged Array 
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
                sum=sum+jaggedArray[i][j];
            }
            System.out.println();
        }
        System.out.println("The Sum is :"+sum);
    }
}
