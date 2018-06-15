import models.Hero;

public class GameEngine {

    public boolean isHeroDead(Hero hero){
        if (hero.getHealthPoints() <= 0) {
            return true;
        } else {
            return false;
        }
    }

    //TODO : mahni println ot tyk
    public void attack(Hero attackingHero, Hero defencingHero){
        int damagePoints = attackingHero.attackingDamage();
        defencingHero.damageReceived(damagePoints);
        if (!isHeroDead(defencingHero)){
            attack(defencingHero,attackingHero);
        } else {
            System.out.println("The game is end.");
        }
    }
}
