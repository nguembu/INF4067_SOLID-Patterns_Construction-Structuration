

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        
        Rectangle rectangle = new Rectangle(4, 3);
        Circle circle = new Circle(5);
        
        System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
        System.out.println("Circle Area: " + calculator.calculateArea(circle));
    }
}