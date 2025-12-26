package composite;

public class TxtFile implements FileSystemElement {

    private String name;

    public TxtFile(String name) {
        this.name = name;
    }

    @Override
    public void describe() {
        System.out.println("Fichier TXT : " + name);
    }
}
