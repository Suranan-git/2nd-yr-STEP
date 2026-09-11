import java.util.Scanner;

public class revWord
{
    String Sentence;

    public String reverseEachWord(String Sentence)
    {
        String[] words = Sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words)
        {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedSentence.append(reversedWord.reverse().toString()).append(" ");
        }

        return reversedSentence.toString().trim();
    }

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String inputSentence = sc.nextLine();

    revWord reverser = new revWord();
    String result = reverser.reverseEachWord(inputSentence);

    System.out.println("Reversed words: " + result);

    sc.close();
  }
}
