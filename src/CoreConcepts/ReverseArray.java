package CoreConcepts;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.print("Reversed array is :");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
