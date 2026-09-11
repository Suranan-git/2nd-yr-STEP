import java.util.Scanner;

abstract class Shape 
{
    abstract double calculateArea();
}

class Circle extends Shape 
{
    double radius;
    Circle(double r) 
    { radius = r; 

    }
    double calculateArea() 
    { return Math.PI * radius * radius; 
        
    }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) { length = l; width = w; }
    double calculateArea() { return length * width; }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) 
    { 
        base = b; height = h;
     }
      double calculateArea()
       {
         return 0.5 * base * height; 
        }
}

public class ShapeDemo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose shape: 1-Circle, 2-Rectangle, 3-Triangle");
        int choice = sc.nextInt();

        Shape s;
        switch(choice) {
            case 1:
                System.out.print("Enter radius: ");
                s = new Circle(sc.nextDouble());
                break;
            case 2:
                System.out.print("Enter length and width: ");
                s = new Rectangle(sc.nextDouble(), sc.nextDouble());
                break;
            case 3:
                System.out.print("Enter base and height: ");
                s = new Triangle(sc.nextDouble(), sc.nextDouble());
                break;
            default:
                System.out.println("Invalid choice"); return;
        }
        System.out.println("Area = " + s.calculateArea());
    }
}
