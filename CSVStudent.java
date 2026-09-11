import java.util.*;

public class CSVStudent
{
    void parseStudentRecord(String csvLine)
    {
        String[] studentRecord = csvLine.split(",");
        String name = studentRecord[0];
        String rno = studentRecord[1];
        String dept = studentRecord[2];

        System.out.println("Name: " + name + " |  Roll No: " + rno + " |  Dept: " + dept);
    }
public static void main(String[] args)
    {
        CSVStudent csv = new CSVStudent();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student record in CSV format (Name,RollNo,Dept):");
        String csvLine = sc.nextLine();
        csv.parseStudentRecord(csvLine);
        sc.close();
    }
}