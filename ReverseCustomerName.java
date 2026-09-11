import java.util.*;

public class ReverseCustomerName {

    static String reverseCustomerName(String customerName) {
        StringBuilder sb = new StringBuilder(customerName);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the customer name: ");
        String customerName = sc.nextLine();
        String reversedName = reverseCustomerName(customerName);

        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reversedName);
        sc.close();
    }
}
