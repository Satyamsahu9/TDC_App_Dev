package codechef;
import java.util.Scanner;
public class cumulativeSum {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];

      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      array_sort(arr);
        int cumulative_sum=0;

      for(int i=0;i<n;i++){

          cumulative_sum=cumulative_sum+arr[i];
          System.out.println(cumulative_sum);
      }
    }
    public static void array_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }


}
