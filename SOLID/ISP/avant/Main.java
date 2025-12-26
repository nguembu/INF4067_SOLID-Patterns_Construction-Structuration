
public class Main {
    public static void main(String[] args) {
        Worker human = new HumanWorker();
        Worker robot = new RobotWorker();
        
        human.work();
        human.eat();
        
        robot.work();
        try {
            robot.eat(); // Provoque une exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}