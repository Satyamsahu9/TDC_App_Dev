package codechef;

import java.util.Scanner;

public class Buzz_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n%10==7 || n%7==0){
            System.out.println("The number provided by the user is Buzz number");
        }
        else {
            System.out.println("The number is not Buzz number");
        }
    }
}
