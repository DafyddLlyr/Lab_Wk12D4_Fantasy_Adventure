package summons;

import enemies.Enemy;

public class Dragon extends Summon {

    private int strength;

    public Dragon(int health, int strength) {
        super(health);
        this.strength = strength;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(this.strength);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
