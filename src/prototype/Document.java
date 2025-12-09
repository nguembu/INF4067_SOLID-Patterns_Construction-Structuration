class Document implements Prototype {
    private String type;

    public Document(String type) {
        this.type = type;
    }

    @Override
    public Document clone() {
        return new Document(this.type);
    }

    public void afficher() {
        System.out.println("Document de type : " + type);
    }
}
