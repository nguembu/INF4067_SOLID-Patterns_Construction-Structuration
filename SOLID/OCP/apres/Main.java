
public class Main {
    public static void main(String[] args) {
        AreaCalculator2 calculator = new AreaCalculator2();
        
        // CORRECTION: Utilisation correcte avec le même package
        Shape rectangle = new Rectangle(4, 3);
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(3, 4);
        
        System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
        System.out.println("Circle Area: " + calculator.calculateArea(circle));
        System.out.println("Triangle Area: " + calculator.calculateArea(triangle));
        
        // Test direct sans calculateur
        System.out.println("Rectangle Area direct: " + rectangle.calculateArea());
        System.out.println("Circle Area direct: " + circle.calculateArea());
    }
}