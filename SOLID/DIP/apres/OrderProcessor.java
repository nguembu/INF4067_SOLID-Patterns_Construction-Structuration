package apres;

public class OrderProcessor {
    private Database database; // Dépendance abstraite

    // Injection de dépendance via constructeur
    public OrderProcessor(Database database) {
        this.database = database;
    }

    public void processOrder(String order) {
        database.save(order);
    }
    
    // Injection via setter (optionnel)
    public void setDatabase(Database database) {
        this.database = database;
    }
}