package models;

public class Knight extends Hero {

    private static final int HEALTH_POINT_KNIGHT = 180;
    private static final int ATTACK_POINT_KNIGHT = 100;
    private static final int ARMOR_POINT_KNIGHT = 100;


    public Knight() {
        super(HEALTH_POINT_KNIGHT, ATTACK_POINT_KNIGHT, ARMOR_POINT_KNIGHT);
    }

    public void damageReceived(int damageMade) {

    }

    public int attackingDamage() {
        return 0;
    }
}
