package codechef;
import java.util.Scanner;
public class Palind {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        String number=sc.next();
        String original=number;
        String reverse="";
        for(int i=number.length()-1;i>=0;i--)
        {
            reverse=reverse+number.charAt(i);



        }
        if(original.equals(reverse))
        {
            System.out.println("The given number is palindrome");
        }
        else
        {
            System.out.println(" The given number is not palindrome");
        }

    }
}
