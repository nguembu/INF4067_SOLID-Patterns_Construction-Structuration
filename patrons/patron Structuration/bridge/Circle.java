// RefinedAbstraction
public class Circle extends Shape {
    
    public Circle(Color color) {
        super(color);
    }
    
    @Override
    public void colorier() {
        System.out.print("Cercle rempli avec ");
        color.remplirCouleur();
    }
}