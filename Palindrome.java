import java.util.Scanner;

public class Palindrome
{
    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a Number: ");
            int num = sc.nextInt();
            int original = num;
            int reversedNumber = 0;
            while(num != 0)
            {
                int digit = num % 10;
                reversedNumber = reversedNumber * 10 + digit;
                num /= 10;
            }
            if (original == reversedNumber)
            {
                System.out.println(original + " is a palindrome.");
            }
            else
            {
                System.out.println(original + " is not a palindrome.");
            }
         sc.close();
    }
}