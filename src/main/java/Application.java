import models.Hero;
import models.Warrior;

public class Application {

    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        Warrior warrior2 = new Warrior();
        GameEngine gameEngine = new GameEngine();
        gameEngine.attack(warrior,warrior2);

    }
}
