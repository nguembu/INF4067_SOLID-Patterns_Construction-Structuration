package composite;

public class Client {

    public static void main(String[] args) {

        Directory root = new Directory("root");
        Directory documents = new Directory("documents");

        FileSystemElement file1 = new TxtFile("cours.txt");
        FileSystemElement file2 = new PdfFile("examen.pdf");

        documents.add(file1);
        documents.add(file2);
        root.add(documents);

        root.describe();
    }
}
