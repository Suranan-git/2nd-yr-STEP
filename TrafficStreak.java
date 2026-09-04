import java.util.Scanner;

public class TrafficStreak {
    static void findLongestStreak(String signalLog) {
        char longestColor = signalLog.charAt(0);
        int longest = 1, current = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                current++;
            } else {
                current = 1;
            }
            if (current > longest) {
                longest = current;
                longestColor = signalLog.charAt(i);
            }
        }

        System.out.println("Longest Streak: '" + longestColor + "' repeated " + longest + " times");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal log (e.g., RRGGGYRR): ");
        String log = sc.nextLine().trim();

        if (log.isEmpty()) {
            System.out.println("Error: Signal log cannot be empty!");
        } else {
            findLongestStreak(log);
            sc.close();
        }
    }
}
