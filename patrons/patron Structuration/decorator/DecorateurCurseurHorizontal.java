// DecorateurConcret
public class DecorateurCurseurHorizontal extends DecorateurFenetre {
    
    private boolean curseurActif;
    private int positionCurseur;
    
    public DecorateurCurseurHorizontal(Fenetre fenetre) {
        super(fenetre);
        this.curseurActif = true;
        this.positionCurseur = 0;
    }
    
    @Override
    public void dessiner() {
        fenetre.dessiner();
        dessinerCurseurHorizontal();
    }
    
    @Override
    public String decrire() {
        return fenetre.decrire() + " + Curseur Horizontal";
    }
    
    public void dessinerCurseurHorizontal() {
        System.out.println("═══════════════════════════════════════");
        System.out.println("Curseur horizontal activé");
        System.out.println("Permet le défilement du texte horizontalement");
        System.out.println("Position du curseur: [" + 
                          "█".repeat(positionCurseur) + 
                          "○" + 
                          "░".repeat(10 - positionCurseur) + 
                          "] (" + (positionCurseur * 10) + "%)");
        System.out.println("═══════════════════════════════════════");
    }
    
    public void activerCurseur(boolean actif) {
        this.curseurActif = actif;
        System.out.println("Curseur horizontal " + (actif ? "activé" : "désactivé"));
    }
    
    public void defilerHorizontal(int position) {
        this.positionCurseur = Math.max(0, Math.min(position, 10));
        System.out.println("Défilement horizontal à " + (positionCurseur * 10) + "%");
    }
    
    public boolean isCurseurActif() {
        return curseurActif;
    }
    
    public int getPositionCurseur() {
        return positionCurseur;
    }
}