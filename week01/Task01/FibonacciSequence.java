package codechef;

public class FibonacciSequence {
    public static void main(String[] args)
    {
        System.out.println("The sum of first and second is equal to the third digit is called fibonacci sequence ");
        int first=0;
        int n=10;
        int second=1;
        for(int i=1;i<=n;i++)
        {
            System.out.print(first+" ");
            int next=first+second;
             first=second;
            second=next;

        }
    }
}
