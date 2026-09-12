import java.util.*;

public class Extension {
    static String validateFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        if (dotIndex == -1) return "Rejected — invalid file type";

        String ext = filename.substring(dotIndex + 1).toLowerCase();
        if (ext.equals("pdf") || ext.equals("docx") || ext.equals("zip")) {
            return "Accepted";
        } else {
            return "Rejected — invalid file type";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = sc.nextLine();
        System.out.println(validateFileExtension(filename));
        sc.close();
    }
}
