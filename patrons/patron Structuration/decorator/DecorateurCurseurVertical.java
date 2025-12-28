// DecorateurConcret
public class DecorateurCurseurVertical extends DecorateurFenetre {
    
    private boolean curseurActif;
    
    public DecorateurCurseurVertical(Fenetre fenetre) {
        super(fenetre);
        this.curseurActif = true;
    }
    
    @Override
    public void dessiner() {
        fenetre.dessiner();
        dessinerCurseurVertical();
    }
    
    @Override
    public String decrire() {
        return fenetre.decrire() + " + Curseur Vertical";
    }
    
    public void dessinerCurseurVertical() {
        System.out.println("║ Curseur vertical activé ║");
        System.out.println("║ Permet le défilement du texte verticalement ║");
        System.out.println("║ Barre de défilement: ███░░░░░░░ (30%) ║");
    }
    
    public void activerCurseur(boolean actif) {
        this.curseurActif = actif;
        System.out.println("Curseur vertical " + (actif ? "activé" : "désactivé"));
    }
    
    public boolean isCurseurActif() {
        return curseurActif;
    }
}