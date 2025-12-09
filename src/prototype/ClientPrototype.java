public class ClientPrototype {
    public static void main(String[] args) {
        Document original = new Document("PDF");
        Document copie = original.clone();
        copie.afficher();
    }
}
