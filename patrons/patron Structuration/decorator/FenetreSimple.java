// ComposantConcret
public class FenetreSimple extends Fenetre {
    
    private String texte;
    private int largeur;
    private int hauteur;
    
    public FenetreSimple(String texte, int largeur, int hauteur) {
        this.texte = texte;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    @Override
    public void dessiner() {
        System.out.println("=== Fenêtre Simple ===");
        System.out.println("Dimensions: " + largeur + "x" + hauteur);
        System.out.println("Texte: " + texte);
        System.out.println("Zone d'affichage: " + getZoneAffichage());
        System.out.println("=====================");
    }
    
    @Override
    public String decrire() {
        return "FenetreSimple [texte=" + texte + 
               ", largeur=" + largeur + 
               ", hauteur=" + hauteur + "]";
    }
    
    private String getZoneAffichage() {
        // Simulation d'une zone limitée
        int capaciteZone = 50; // capacité de la zone d'affichage
        if (texte.length() > capaciteZone) {
            return "Texte tronqué (" + capaciteZone + "/" + texte.length() + " caractères)";
        }
        return "Texte complet (" + texte.length() + " caractères)";
    }
    
    public String getTexte() {
        return texte;
    }
    
    public int getLargeur() {
        return largeur;
    }
    
    public int getHauteur() {
        return hauteur;
    }
}