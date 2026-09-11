import java.util.Scanner;

interface Payment {
    void makePayment(double amount);
}

class UPI implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid Rs." + amount + " via UPI.");
    }
}

class CreditCard implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid Rs." + amount + " via Credit Card.");
    }
}

class NetBanking implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid Rs." + amount + " via Net Banking.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select payment method: 1-UPI, 2-Credit Card, 3-Net Banking");
        int choice = sc.nextInt();
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        Payment p;
        switch(choice) {
            case 1: p = new UPI(); break;
            case 2: p = new CreditCard(); break;
            case 3: p = new NetBanking(); break;
            default: System.out.println("Invalid choice"); 
            sc.close();
            return;
        }
        p.makePayment(amt);
        sc.close();
    }
}
