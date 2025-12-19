package adapter;

public class Client {

    public static void main(String[] args) {
        Square square = new SquareAdapter();
        square.setSide(4);

        System.out.println("Aire du carré : " + square.getArea());
    }
}
