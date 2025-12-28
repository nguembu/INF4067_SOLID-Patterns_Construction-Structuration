// Decorateur (classe abstraite)
public abstract class DecorateurFenetre extends Fenetre {
    
    protected Fenetre fenetre;
    
    public DecorateurFenetre(Fenetre fenetre) {
        this.fenetre = fenetre;
    }
    
    @Override
    public void dessiner() {
        fenetre.dessiner();
    }
    
    @Override
    public String decrire() {
        return fenetre.decrire();
    }
}