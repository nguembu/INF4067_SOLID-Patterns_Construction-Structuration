package avant;


public class OrderProcessor {
    private MySQLDatabase database = new MySQLDatabase();

    public void process(String orderData) {
        System.out.println("Processing order: " + orderData);
        database.saveOrder(orderData); // dépendance forte
    }
}
