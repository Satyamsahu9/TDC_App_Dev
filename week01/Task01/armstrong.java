package codechef;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("The sum of the cube of the digits is equal to number then the number is Armstrong number ");
        int original=number;
        int sum=0;
        while(number>0)
        {
            int digit=number%10;
             sum=sum + (digit*digit*digit);
             number=number/10;

        }
        if(sum==original){
            System.out.println(original+" is Armstrong number");
        }
        else {
            System.out.println(original + " is not Armstrong");

        }
    }
}
