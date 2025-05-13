package codechef;

import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        // now we input the values in array through user by using loop
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
       insertion_arr(arr);
       for(int i=0;i<n;i++){
           System.out.println(arr[i]+" ");
       }
    }
    public static void insertion_arr( int arr[]){
        for(int i=1;i<arr.length;i++)
        {
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] =current;
        }
    }

}
