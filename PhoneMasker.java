import java.util.*;

public class PhoneMasker {
    static String maskPhoneNumber(String phone) {
        if (phone.length() != 10 || !phone.matches("\\d+")) {
            return "Invalid phone number";
        }
        StringBuilder sb = new StringBuilder("XXXXXX-");
        sb.append(phone.substring(6));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();
        System.out.println(maskPhoneNumber(phone));
        sc.close();
    }
}
