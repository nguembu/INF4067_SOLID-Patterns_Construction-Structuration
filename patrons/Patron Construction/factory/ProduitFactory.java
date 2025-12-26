public class ProduitFactory {
    public static final int TYPE_PRODUITA1 = 1;
    public static final int TYPE_PRODUITA2 = 2;
    public static final int TYPE_PRODUITA3 = 3;

    public ProduitA getProduitA(int typeProduit) {
        switch (typeProduit) {
            case TYPE_PRODUITA1:
                return new ProduitA1();
            case TYPE_PRODUITA2:
                return new ProduitA2();
            case TYPE_PRODUITA3:
                return new ProduitA3();
            default:
                throw new IllegalArgumentException("Type de produit inconnu");
        }
    }
}
