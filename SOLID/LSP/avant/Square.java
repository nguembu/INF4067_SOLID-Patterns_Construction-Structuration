
public class Square extends Rectangle {

   
    public Square(int side) {
        super(side, side);
    }

    
    public Square() {
     
        super(1, 1);
    }

    
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }

    public int getSide() {
        
        return width;
    }

    @Override
    public String toString() {
        return "Square(side=" + width + ")";
    }
}
