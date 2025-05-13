package codechef;
import java.util.Scanner;
public class Binary_search {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        array_sort(arr);
        int target=sc.nextInt();

        int result= binary_search(arr,target);

        if(result==-1){
            System.out.println("Target not found");
        }
        else{
            System.out.println("Targer found");
        }


    }
    public static void array_sort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static int  binary_search(int[] arr,int target){
        int low=0 ,high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;


            if(arr[mid]==target){
                 return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;
    }
}
