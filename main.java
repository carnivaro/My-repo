import java.util.Scanner;

abstract class Shape {
     abstract double calculateArea();
}
class Rectangle extends Shape{
    private double length;
    private double breadth;
    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner
        (System.in);
        
        System.out.println("Pick a shape:");
        System.out.println("1. Rectangle");
 int choice = scanner.nextInt();
        double dim1, dim2;
        switch (choice) {
            case 1:
System.out.print("Input the length of the rectangle: ");
                dim1 = scanner.nextDouble();
                System.out.println("Input the breadth of the rectangle: ");
                dim2 = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(dim1, dim2);
                System.out.println("Area of the rectangle: " + rectangle.calculateArea());
                break;
       default:
                System.out.println("Wrong option");
        }
        scanner.close();
    }
}