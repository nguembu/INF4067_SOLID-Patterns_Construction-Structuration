// RefinedAbstraction
public class Rectangle extends Shape {
    
    public Rectangle(Color color) {
        super(color);
    }
    
    @Override
    public void colorier() {
        System.out.print("Rectangle rempli avec ");
        color.remplirCouleur();
    }
}