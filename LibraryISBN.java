import java.util.Scanner;

public class LibraryISBN {

    public static String normalizeCode(String raw) {
        if (raw == null) return null;

        String trimmed = raw.trim();

        if (trimmed.length() >= 3) {
            String pub = trimmed.substring(0, 3).toUpperCase();
            String rest = trimmed.substring(3);
            return pub + rest;
        }
        return trimmed;
    }
    public static String validateAndFormat(String code) {

        if (code.length() != 13) {
            return "Invalid: wrong length (" + code.length() + ")";
        }

        String pub = code.substring(0, 3);
        if (!pub.matches("[A-Z]{3}")) {
            return "Invalid: publisher code must be 3 letters";
        }

        String body = code.substring(3);
        if (!body.matches("\\d{10}")) {
            return "Invalid: year+catalog must be digits";
        }

        String year = body.substring(0, 4);
        String catalog = body.substring(4);

        StringBuilder sb = new StringBuilder();
        sb.append("[").append(pub).append("] ")
          .append("YEAR: ").append(year).append(" | ")
          .append("CATALOG: ").append(catalog);

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN code: ");
        String input = sc.nextLine();
        String normalized = normalizeCode(input);
        String result = validateAndFormat(normalized);
        System.out.println(result);
        sc.close();
    }
}
