package weapons;

import enemies.Enemy;
import interfaces.IWeapon;
import players.fighters.Fighter;

public class Axe implements IWeapon {

    private final int damage;
    private final int weight;

    public Axe() {
        this.damage = 5;
        this.weight = 10;
    }

    public void attack(Fighter fighter, Enemy enemy) {
        int totalDamage = fighter.getStrength() * this.damage;
        enemy.takeDamage(totalDamage);
    }

    public int getDamage() {
        return this.damage;
    }

    public int getWeight() {
        return this.weight;
    }
}
