
public class MainISP {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        RobotWorker robot = new RobotWorker();
        
        human.work();
        human.eat();
        
        robot.work();
        // Pas de méthode eat() pour RobotWorker - design correct
        
        // Utilisation avec des interfaces spécifiques
        Workable[] workers = {new HumanWorker(), new RobotWorker()};
        Eatable[] eaters = {new HumanWorker()}; // Seulement ceux qui peuvent manger
        
        for (Workable worker : workers) {
            worker.work();
        }
        
        for (Eatable eater : eaters) {
            eater.eat();
        }
    }
}