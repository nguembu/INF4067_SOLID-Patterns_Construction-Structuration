public final class Singleton {
    private static Singleton instance = null;
    private int x;
    private int y;
    private String nom;

    private Singleton() {
        super();
    }

    private Singleton(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private Singleton(int x, int y, String nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance(int x, int y) {
        if (instance == null) {
            instance = new Singleton(x, y);
        } else {
            instance.x = x;
            instance.y = y;
        }
        return instance;
    }

    public static Singleton getInstance(int x, int y, String nom) {
        if (instance == null) {
            instance = new Singleton(x, y, nom);
        } else {
            instance.x = x;
            instance.y = y;
            instance.nom = nom;
        }
        return instance;
    }

    public void affiche() {
        System.out.println("x = " + x + ", y = " + y + ", nom = " + nom);
    }

    public int somme(int a, int b) {
        return a + b;
    }
}
