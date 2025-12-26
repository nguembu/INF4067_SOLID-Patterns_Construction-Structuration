

public class Main {
    public static void main(String[] args) {
        BookSRP book = new BookSRP("Les principes SOLID", "Etudiants de MI-GL", "Révision des principes SOLID");
        
        BookPrinter printer = new BookPrinter();
        BookSaver saver = new BookSaver();
        BookBusinessLogic business = new BookBusinessLogic();
        
        printer.printToScreen(book);
        printer.printToHTML(book);
        saver.saveToDatabase(book);
        saver.saveToFile(book, "livre.txt");
        business.emprunter(book, "Marcial");
        business.autreService(book);
    }
}