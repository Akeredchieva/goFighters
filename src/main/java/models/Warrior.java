package models;

public class Warrior extends Hero {

    private static final int HEALTH_POINT_WARRIOR = 200;
    private static final int ATTACK_POINT_WARRIOR = 200;
    private static final int ARMOR_POINT_WARRIOR = 200;

    public Warrior() {
        super(HEALTH_POINT_WARRIOR, ATTACK_POINT_WARRIOR, ARMOR_POINT_WARRIOR);
    }

    // TODO : popravi si logikata - trqbva da ima shans ot 20% da blokira udara izcqlo
    public void damageReceived(int damageMade) {
        int remainingHealthPoints = getHealthPoints()- damageMade;
        setHealthPoints(remainingHealthPoints);
    }

    // TODO : popravi si logikata - trqbva da ima 10% shans da udari s 200% damage
    public int attackingDamage() {
        return this.percentageOfAttacking();
    }

}
