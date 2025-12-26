package apres;

public class Main {
    public static void main(String[] args) {
        // Facile de changer la base de données
        Database mysql = new MySQLDatabase();
        Database mongodb = new MongoDBDatabase();
        
        OrderProcessor order1 = new OrderProcessor(mysql);
        order1.processOrder("Données MySQL");
        
        OrderProcessor order2 = new OrderProcessor(mongodb);
        order2.processOrder("Données MongoDB");
        
        // Changement dynamique
        order1.setDatabase(mongodb);
        order1.processOrder("Nouvelles données MongoDB");
    }
}