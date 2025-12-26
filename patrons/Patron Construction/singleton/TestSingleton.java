public class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance(10, 20, "Premier");
        s1.affiche();

        Singleton s2 = Singleton.getInstance(30, 40, "Second");
        s2.affiche();

        System.out.println("Somme : " + s1.somme(5, 3));
    }
}
