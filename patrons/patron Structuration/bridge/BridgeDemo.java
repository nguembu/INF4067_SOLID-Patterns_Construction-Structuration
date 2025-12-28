// Client
public class BridgeDemo {
    
    public static void main(String[] args) {
        
        System.out.println("=== Démonstration du patron Bridge ===");
        
        // Création des couleurs
        Color rouge = new RedColor();
        Color bleu = new BlueColor();
        
        // Création des formes avec différentes couleurs
        Shape rectangleRouge = new Rectangle(rouge);
        Shape rectangleBleu = new Rectangle(bleu);
        Shape cercleRouge = new Circle(rouge);
        Shape cercleBleu = new Circle(bleu);
        
        // Utilisation
        rectangleRouge.colorier();
        rectangleBleu.colorier();
        cercleRouge.colorier();
        cercleBleu.colorier();
        
        System.out.println("\n=== Fin de la démonstration ===");
    }
}