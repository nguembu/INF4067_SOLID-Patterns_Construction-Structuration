package composite;

public class PdfFile implements FileSystemElement {

    private String name;

    public PdfFile(String name) {
        this.name = name;
    }

    @Override
    public void describe() {
        System.out.println("Fichier PDF : " + name);
    }
}
