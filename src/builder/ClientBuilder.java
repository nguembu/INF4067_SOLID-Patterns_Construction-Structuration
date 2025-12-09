public class ClientBuilder {
    public static void main(String[] args) {
        Directeur directeur = new Directeur();

        MonteurPizza monteurReine = new MonteurPizzaReine();
        directeur.setMonteur(monteurReine);
        Pizza pizzaReine = directeur.construire();
        pizzaReine.print();

        System.out.println();

        MonteurPizza monteurPiquante = new MonteurPizzaPiquante();
        directeur.setMonteur(monteurPiquante);
        Pizza pizzaPiquante = directeur.construire();
        pizzaPiquante.print();
    }
}
