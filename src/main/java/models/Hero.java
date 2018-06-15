package models;

public abstract class Hero {

    private int healthPoints;
    private int attackPoints;
    private int armorPoints;

    public Hero(int healthPoints, int attackPoints, int armorPoints) {
        this.healthPoints = healthPoints;
        this.attackPoints = attackPoints;
        this.armorPoints = armorPoints;
    }

    public abstract void damageReceived(int damageMade);

    public abstract int attackingDamage();

    public int percentageOfAttacking(){
        int range = 120 - 80 + 1;
        return this.getArmorPoints()*(((int)(Math.random() * range) + 80)/100);
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    protected void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    protected void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getArmorPoints() {
        return armorPoints;
    }

    protected void setArmorPoints(int armorPoints) {
        this.armorPoints = armorPoints;
    }
}
