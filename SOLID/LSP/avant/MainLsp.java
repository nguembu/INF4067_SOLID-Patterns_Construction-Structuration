// MainLsp.java
public class MainLsp {
    public static void main(String[] args) {
        // Exemple montrant la mauvaise substitution (LSP est violé conceptuellement)
        Rectangle r = new Rectangle(4, 5);
        System.out.println("Rectangle r: " + r + " area=" + r.getArea());

        // On instancie un Square sans argument (corrigé grâce au constructeur par défaut)
        Rectangle squareAsRectangle = new Square(); // compilera maintenant
        System.out.println("squareAsRectangle initial: " + squareAsRectangle + " area=" + squareAsRectangle.getArea());

        // On modifie la width en pensant travailler sur un rectangle
        squareAsRectangle.setWidth(10);
        // Si l'instance est en réalité un Square, setWidth(10) affectera aussi la height,
        // donc le comportement attendu pour un Rectangle normal est brisé.
        System.out.println("Après setWidth(10): " + squareAsRectangle + " area=" + squareAsRectangle.getArea());

        // Exemples supplémentaires
        Rectangle r2 = new Square(3); // polymorphisme possible mais problématique
        System.out.println("r2 (new Square(3)): " + r2 + " area=" + r2.getArea());

        r2.setHeight(5); // provoque changement aussi de width si c'est un Square
        System.out.println("Après r2.setHeight(5): " + r2 + " area=" + r2.getArea());
    }
}
