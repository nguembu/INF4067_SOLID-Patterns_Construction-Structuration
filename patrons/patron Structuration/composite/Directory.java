package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {

    private String name;
    private List<FileSystemElement> elements;

    public Directory(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(FileSystemElement element) {
        elements.add(element);
    }

    public void remove(FileSystemElement element) {
        elements.remove(element);
    }

    public FileSystemElement get(int index) {
        return elements.get(index);
    }

    @Override
    public void describe() {
        System.out.println("Dossier : " + name);
        for (FileSystemElement e : elements) {
            e.describe();
        }
    }
}
