 

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Les principes SOLID", "Etudiants de MI-GL", "Révision des principes SOLID");
        
        book.printToScreen();
        book.saveToDatabase();
        book.emprunter("Marcial");
    }
}