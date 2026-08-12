import java.util.*;
import java.util.Scanner;

public class FeedbackAnalyzer {

    private static final Set<String> STOP_WORDS = new HashSet<>(
        Arrays.asList("the","was","and","a","is","of","in")
    );

    public static void printFilteredWordFrequency(String feedback) {
        if (feedback == null || feedback.isEmpty()) {
            System.out.println("No feedback provided.");
            return;
        }

        String cleaned = feedback.toLowerCase()
                                 .replace(".", "")
                                 .replace(",", "");

        String[] words = cleaned.split("\\s+");

        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            if (!STOP_WORDS.contains(word) && !word.isEmpty()) {
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(freqMap.entrySet());
        sortedList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feedback: ");
        String feedback = scanner.nextLine();
        printFilteredWordFrequency(feedback);
    }
}
