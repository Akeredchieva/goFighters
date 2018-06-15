package models;

public class Monk extends Hero {

    private static final int HEALTH_POINT_MONK = 250;
    private static final int ATTACK_POINT_MONK = 150;
    private static final int ARMOR_POINT_MONK = 50;

    public Monk() {
        super(HEALTH_POINT_MONK, ATTACK_POINT_MONK, ARMOR_POINT_MONK);
    }

    public void damageReceived(int damageMade) {

    }

    public int attackingDamage() {
        return 0;
    }
}
