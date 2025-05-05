package CoreConcepts;

public class SumOfOddPosition {
    public static void main(String[] args) {
        int[] arr={3,4,6,2,5,1,7};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum+=arr[i];
            }
        }
        System.out.println("The sum of odd positions number is :"+sum);
    }
}
