import java.util.Scanner;

public class ATM 
{
    int checkPIN;

    void checkPinLength(String PIN) 
    {

    checkPIN = PIN.length();

    if (checkPIN == 4) 
    {
        System.out.println("PIN length ok.");
    } 
    else 
    {
        System.out.println("Invalid PIN - Must Be Exactly 4 Digits.");
    }
  }


public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);
    ATM atm = new ATM();

    System.out.print("Enter your PIN: ");
    String userPIN = input.nextLine();

    atm.checkPinLength(userPIN);

    input.close();
}
}