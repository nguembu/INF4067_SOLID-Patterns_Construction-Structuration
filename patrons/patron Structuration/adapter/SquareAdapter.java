package adapter;

public class SquareAdapter implements Square {

    private Rectangle rectangle;

    public SquareAdapter() {
        this.rectangle = new Rectangle();
    }

    @Override
    public void setSide(double side) {
        rectangle.setWidth(side);
        rectangle.setHeight(side);
    }

    @Override
    public double getArea() {
        return rectangle.getArea();
    }
}
