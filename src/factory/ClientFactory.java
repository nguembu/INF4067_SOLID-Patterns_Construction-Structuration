public class ClientFactory {
    public static void main(String[] args) {
        ProduitFactory factory = new ProduitFactory();

        ProduitA p1 = factory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
        p1.methodeA();

        ProduitA p2 = factory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
        p2.methodeA();

        ProduitA p3 = factory.getProduitA(ProduitFactory.TYPE_PRODUITA3);
        p3.methodeA();
    }
}
