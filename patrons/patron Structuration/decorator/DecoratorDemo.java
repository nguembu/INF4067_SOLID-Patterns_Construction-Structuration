// Client
public class DecoratorDemo {
    
    public static void main(String[] args) {
        
        System.out.println("Démonstration du patron Decorator ");
        System.out.println("Exemple: Fenêtres avec capacités de défilement\n");
        
        
        String texteLong =  "La Coupe d'Afrique des Nations 2023 s'est déroulée en Côte " +
                          "d'Ivoire avec une participation record de 24 équipes. Le " +
                          "tournoi a été marqué par des surprises et des performances " +
                          "exceptionnelles. L'équipe nationale du Cameroun, les Lions " +
                          "Indomptables, a livré des matchs passionnants malgré une " +
                          "élimination prématurée. Vincent Aboubakar, le capitaine, a " +
                          "montré son leadership sur le terrain. Le tournoi a également " +
                          "été l'occasion de découvrir de jeunes talents prometteurs " +
                          "comme les attaquants ivoiriens et les milieux de terrain " +
                          "sénégalais. Le Maroc, finaliste de la Coupe du Monde 2022, " +
                          "était parmi les favoris mais a été éliminé en quarts de " +
                          "finale. La compétition a mis en lumière l'évolution du " +
                          "football africain avec des tactiques plus sophistiquées et " +
                          "une organisation défensive améliorée. Les stades modernes " +
                          "d'Abidjan et de Yamoussoukro ont accueilli des matchs " +
                          "de grande intensité devant des foules enthousiastes.";
        
        // 1. Création d'une fenêtre simple
        System.out.println("=== 1. Fenêtre simple ===");
        Fenetre fenetreSimple = new FenetreSimple(texteLong, 800, 600);
        fenetreSimple.dessiner();
        System.out.println("Description: " + fenetreSimple.decrire());
        
        System.out.println("\n=== 2. Fenêtre avec curseur vertical ===");
        // 2. Ajout d'un curseur vertical
        Fenetre fenetreAvecVertical = new DecorateurCurseurVertical(fenetreSimple);
        fenetreAvecVertical.dessiner();
        System.out.println("Description: " + fenetreAvecVertical.decrire());
        
        System.out.println("\n=== 3. Fenêtre avec curseur vertical ET horizontal ===");
        // 3. Ajout des deux curseurs (vertical + horizontal)
        Fenetre fenetreComplete = new DecorateurCurseurHorizontal(fenetreAvecVertical);
        fenetreComplete.dessiner();
        System.out.println("Description: " + fenetreComplete.decrire());
        
        System.out.println("\n=== 4. Utilisation dynamique des fonctionnalités ===");
        // Test des fonctionnalités supplémentaires
        DecorateurCurseurHorizontal decorateurHorizontal = 
            (DecorateurCurseurHorizontal) fenetreComplete;
        
        System.out.println("Changement de position du curseur horizontal...");
        decorateurHorizontal.defilerHorizontal(7);
        
        // Création d'une nouvelle fenêtre avec seulement le curseur horizontal
        System.out.println("\n=== 5. Fenêtre avec seulement curseur horizontal ===");
        Fenetre fenetreHorizontaleSeule = 
            new DecorateurCurseurHorizontal(
                new FenetreSimple("Texte court", 400, 300)
            );
        fenetreHorizontaleSeule.dessiner();
        
        System.out.println("\n=== Avantages du patron Decorator ===");
        System.out.println("1. Flexibilité: On peut combiner les fonctionnalités dynamiquement");
        System.out.println("2. Respect OCP: On peut ajouter de nouvelles fonctionnalités sans modifier le code existant");
        System.out.println("3. Transparence: Le client traite toutes les fenêtres de la même manière");
        
        System.out.println("\n=== Fin de la démonstration ===");
    }
}