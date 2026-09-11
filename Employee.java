import java.util.Scanner;

public class Employee
{
    int empid;
    String empname;
    double salary;

    Employee(int empid, String empname, double salary)
    {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }

    double ann_Sal()
    {
        return salary * 12;
    }

    double bonus()
    {
        return salary * 0.10;
    }

    void display()
    {
        System.out.println("ID: " + empid);
        System.out.println("Name: " + empname);
        System.out.println("Salary: " + salary);
        System.out.println("Annual Salary: " + ann_Sal());
        System.out.println("Bonus: " + bonus());
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Employee emp[] = new Employee[5];

        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Employee Name: ");
            String name = sc.next();

            System.out.print("Enter Employee Salary: ");
            double sal = sc.nextDouble();

            emp[i] = new Employee(id, name, sal);

            // Gap between employees
            System.out.println();
        }

        System.out.println("Employee Details:");
        System.out.println();

        for(int i = 0; i < 5; i++)
        {
            emp[i].display();
        }

        sc.close();
    }
}