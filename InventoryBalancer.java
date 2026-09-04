import java.util.Scanner;

public class InventoryBalancer {
    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0;
        for (int a : sectionA) totalA += a;
        for (int b : sectionB) totalB += b;

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        int highest = sectionA[0];
        String location = "Section A";
        int index = 1;

        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highest) {
                highest = sectionA[i];
                location = "Section A";
                index = i + 1;
            }
        }
        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                location = "Section B";
                index = i + 1;
            }
        }

        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB +
                           " | Status: " + status + " | Highest Quantity: " + highest +
                           " (" + location + ", Item " + index + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        System.out.println("Enter quantities for Section A:");
        for (int i = 0; i < n; i++) sectionA[i] = sc.nextInt();

        System.out.println("Enter quantities for Section B:");
        for (int i = 0; i < n; i++) sectionB[i] = sc.nextInt();

        analyzeInventory(sectionA, sectionB);
        sc.close();
    }
}
