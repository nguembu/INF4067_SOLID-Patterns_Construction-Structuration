public class MainLsp2 {
    public static void main(String[] args) {
        //  Utilisation polymorphique correcte
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Square Area: " + square.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());

        System.out.println("\n=== Liste des formes (substitution LSP) ===");
        //  Toutes les formes peuvent être utilisées de manière interchangeable
        Shape[] shapes = {
            new Square(3),
            new Rectangle(2, 5),
            new Square(4)
        };

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area: " + shape.getArea());
        }
    }
}